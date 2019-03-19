package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Response;
import com.fest.watchtogether.entity.UploadFile;
import com.fest.watchtogether.util.FFMPEGUtils;
import com.fest.watchtogether.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/upload")
public class FileController {
	private final Response res = new Response();
	private final String signal = "/chunk_";
	private final Map<String, Object> response = new HashMap<>();
		private String FILE_PATH = FileUtils.getClassPath();
//	private String FILE_PATH = System.getenv("MVOD_RESOURCE_HOME");
	private Logger logger = LoggerFactory.getLogger(FileController.class);
	private String VIDEO_PATH = FILE_PATH + "static/upload/videos";
	private String IMAGE_PATH = FILE_PATH + "static/upload/images";
	private String VIDEO_TEMP_PATH = FILE_PATH + "static/upload/videos/temp";
	private String IMAGE_TEMP_PATH = FILE_PATH + "static/upload/images/temp";
	
	public FileController() throws FileNotFoundException {
	}
	
	//	@PostMapping("/upload")
	public Object upload(@RequestParam(name = "file") MultipartFile[] files) {
		response.clear();
		List<Map<String, Object>> results = new ArrayList<>();
		List<MultipartFile> multipartFileList = Arrays.asList(files);
		multipartFileList.forEach(file -> {
			boolean success = false;
			try {
				String serverLocalPath = FileUtils.saveFile(file);
				success = true;
				response.put("msg", "Saved");
				response.put("url", serverLocalPath);
			} catch (IOException e) {
				response.put("msg", e.getMessage());
			}
			response.put("success", success);
			results.add(response);
		});
		return results;
	}
	
	@PostMapping("video")
	public Object uploadVideo(UploadFile uploadFile) {
		res.getData().clear();
		
		MultipartFile slice = uploadFile.getFile();
		
		int currentSlice = uploadFile.getCurrentSlice();
		int totalSlices = uploadFile.getTotalSlices();
		
		String filename = uploadFile.getFilename();
		String md5 = uploadFile.getMd5();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String time = format.format(date);
		String slicesDir = VIDEO_TEMP_PATH + "/" + time + "/" + md5;
		try {
			FileUtils.saveSlice(slice, slicesDir, signal, currentSlice);
			if (currentSlice == totalSlices) {
				logger.info("merge slice");
				Thread thread = new Thread(() -> {
					String dest = VIDEO_PATH + "/" + time + "/" + filename;
					System.out.println(dest);
					try {
						FileUtils.mergeSlices(slicesDir, dest, signal);
					} catch (IOException e) {
						e.printStackTrace();
					}
					FileUtils.deleteSlices(slicesDir);
					File destFile = new File(dest);
					boolean success = false;
					if (FFMPEGUtils.canCanvert(destFile) && !FFMPEGUtils.isMP4(destFile)) {
						try {
							success = FFMPEGUtils.convertVideo2MP4(destFile, destFile.getParent());
						} catch (IOException | InterruptedException e) {
							e.printStackTrace();
						} finally {
							if (success) {
								FileUtils.deleteFile(destFile);
							}
						}
					}
				});
				thread.start();
				res.setSuccess(true);
				res.setMessage("Save");
				res.getData().put("url", "/upload/videos/" + time + "/" + filename.substring(0, filename.lastIndexOf(".") + 1) + "mp4");
			} else {
				res.setSuccess(true);
				res.setMessage("Current slice saved");
			}
		} catch (IOException e) {
			res.setSuccess(false);
			res.setMessage("Failed caused by:" + e.getMessage());
		}
		return res;
	}
	
	@PostMapping("image")
	public Object savePic(UploadFile uploadFile) {
		res.getData().clear();
		
		MultipartFile slice = uploadFile.getFile();
		
		int currentSlice = uploadFile.getCurrentSlice();
		int totalSlices = uploadFile.getTotalSlices();
		
		String filename;
		filename = uploadFile.getFilename();
		String md5 = uploadFile.getMd5();
		Date date = new Date();
		SimpleDateFormat format;
		format = new SimpleDateFormat("yyyyMMdd");
		String time = format.format(date);
		String slicesDir = IMAGE_TEMP_PATH + "/" + time + "/" + md5;
		try {
			FileUtils.saveSlice(slice, slicesDir, signal, currentSlice);
			if (currentSlice == totalSlices) {
				logger.info("merge slice");
				Thread thread = new Thread(() -> {
					String dest = IMAGE_PATH + "/" + time + "/" + filename;
					try {
						FileUtils.mergeSlices(slicesDir, dest, signal);
					} catch (IOException e) {
						e.printStackTrace();
					}
					FileUtils.deleteSlices(slicesDir);
				});
				thread.start();
				res.setSuccess(true);
				res.setMessage("Save");
				res.getData().put("url", "/upload/images/" + time + "/" + filename);
			} else {
				res.setSuccess(true);
				res.setMessage("Current slice saved");
			}
		} catch (IOException e) {
			res.setSuccess(false);
			res.setMessage("Failed caused by:" + e.getMessage());
		}
		return res;
	}
	
	@GetMapping("/download/{filename}")
	public ResponseEntity<ByteArrayResource> download(@PathVariable(name = "filename") String filename) {
		File fileToDownload;
		HttpHeaders headers;
		ByteArrayResource resource;
		try {
			String classpath = FileUtils.getClassPath();
			fileToDownload = new File(classpath + "/static/files/", filename);
			Path path = Paths.get(fileToDownload.getAbsolutePath());
			resource = new ByteArrayResource(Files.readAllBytes(path));
			headers = new HttpHeaders();
			headers.add(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, must-revalidate");
			headers.add(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=\"%s\"", fileToDownload.getName()));
			headers.add(HttpHeaders.PRAGMA, "no-cache");
			headers.add(HttpHeaders.EXPIRES, "0");
			return ResponseEntity
					.ok()
					.headers(headers)
					.contentLength(fileToDownload.length())
					.contentType(MediaType.APPLICATION_OCTET_STREAM)
					.body(resource);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
