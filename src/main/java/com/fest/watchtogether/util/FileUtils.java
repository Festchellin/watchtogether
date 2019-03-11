package com.fest.watchtogether.util;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileUtils implements Serializable {
	private FileUtils() {
	}
	
	public static String saveFile(MultipartFile file) throws IOException {
		Map<String, Object> result = new HashMap<>();
		String filePath;
		String fileName = System.currentTimeMillis() + "";
		String suffixName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		filePath = ResourceUtils.getFile("classpath:").getPath() + "/static/files/" + fileName + "." + suffixName;
		byte[] bytes = file.getBytes();
		Path path = Paths.get(filePath);
		Files.write(path, bytes);
		return "/api/files/" + fileName + "." + suffixName;
	}
	
	public static String getClassPath() throws FileNotFoundException {
		return ResourceUtils.getURL("classpath:").getPath();
	}
	
}
