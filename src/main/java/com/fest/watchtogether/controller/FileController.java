package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Response;
import com.fest.watchtogether.entity.UploadFile;
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
import java.util.*;

@RestController
@RequestMapping("/upload")
public class FileController {
	private final Response res = new Response();
	private final String signal = "/chunk_";
	private final Map<String, Object> response = new HashMap<>();
	private String FILE_PATH = FileUtils.filePath;
	private Logger logger = LoggerFactory.getLogger(FileController.class);
	private String VIDEO_PATH = FILE_PATH + "/upload/videos";
	private String IMAGE_PATH = FILE_PATH + "/upload/images";
	private String VIDEO_TEMP_PATH = FILE_PATH + "/upload/videos/temp";
	private String IMAGE_TEMP_PATH = FILE_PATH + "/upload/images/temp";
	
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
		String slicesDir = VIDEO_TEMP_PATH + "/" + md5;
		try {
			FileUtils.saveSlice(slice, slicesDir, signal, currentSlice);
			if (currentSlice == totalSlices) {
				logger.info("merge slice");
				Thread thread = new Thread(() -> {
					String dest = VIDEO_PATH + "/" + filename;
					System.out.println(dest);
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
				res.getData().put("url", "/api/upload/videos/" + filename);
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
		
		String filename = uploadFile.getFilename();
		String md5 = uploadFile.getMd5();
		
		int totalSlices = uploadFile.getTotalSlices();
		int currentSlice = uploadFile.getCurrentSlice();
		
		String slicesDir = IMAGE_TEMP_PATH + "/" + md5;
		String dest = IMAGE_PATH + "/" + filename;
		try {
			logger.info("start save slice");
			FileUtils.saveSlice(slice, slicesDir, signal, currentSlice);
			if (currentSlice == totalSlices) {
				logger.info("merge slice");
				FileUtils.mergeSlices(slicesDir, dest, signal);
				logger.info("delete slice");
				FileUtils.deleteSlices(slicesDir);
				res.setSuccess(true);
				res.setMessage("Save");
				res.getData().put("url", "/api/upload/images/" + filename);
			} else {
				res.setSuccess(false);
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
