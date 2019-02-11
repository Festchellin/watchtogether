package com.fest.watchtogether.controller;

import com.fest.watchtogether.util.FileUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Festchellin
 * @version 1.0
 * @class FileControlller
 * @description
 * @date 1/17/2019  2:01 PM
 */
@RestController
public class FileController {
	private final Map<String, Object> response = new HashMap<>();
	
	@PostMapping("/upload")
	public Object upload(@RequestParam(name = "file") MultipartFile[] files) {
		response.clear();
		List<Map<String, Object>> results = new ArrayList<>();
		List<MultipartFile> multipartFileList = Arrays.asList(files);
		multipartFileList.forEach(file -> {
			boolean success = false;
			try {
				String serverLocalPath = FileUtils.saveFile(file);
				success = true;
				response.put("msg", "Video Saved");
				response.put("url", serverLocalPath);
			} catch (IOException e) {
				response.put("msg", e.getMessage());
			}
			response.put("success", success);
			results.add(response);
		});
		return results;
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
