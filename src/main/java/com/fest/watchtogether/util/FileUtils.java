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

/**
 * @author Festchellin
 * @version 1.0
 * @className FileUtils
 * @description
 * @date 1/16/2019  2:29 PM
 */
public class FileUtils implements Serializable {
	private FileUtils() {
	}
	
	/**
	 * @return java.lang.Object
	 * @throws
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description 默认存储在static目录下的 files目录
	 * @date 4:12 PM 1/17/2019
	 * @Param [file]
	 */
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
