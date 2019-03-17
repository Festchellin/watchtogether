package com.fest.watchtogether.util;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
public class FileUtils implements Serializable {
	public static final String filePath = "E:/mvodResources";
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
	
	public static void saveSlice(MultipartFile slice, String slicesDir, String signal, int sliceNum) throws IOException {
		File tempFile = new File(slicesDir, signal + sliceNum + ".part");
		if (!tempFile.getParentFile().exists()) tempFile.getParentFile().mkdirs();
		RandomAccessFile randomAccessFile = null;
		randomAccessFile = new RandomAccessFile(tempFile, "rw");
		randomAccessFile.write(slice.getBytes());
		randomAccessFile.close();
	}
	
	public static void mergeSlices(String slicesDir, String dest, String signal) throws IOException {
		File parent = new File(slicesDir);
		File destFile = new File(dest);
		if (!destFile.getParentFile().exists()) {
			destFile.getParentFile().mkdirs();
		}
		File[] files = parent.listFiles();
		FileChannel outChannel = new FileOutputStream(destFile, true).getChannel();
		FileChannel inChannel = null;
		for (int i = 0; i < files.length; i++) {
			File file = new File(parent, signal + i + ".part");
			inChannel = new FileInputStream(file).getChannel();
			inChannel.transferTo(0, inChannel.size(), outChannel);
			inChannel.close();
		}
	}
	
	public static boolean deleteSlices(String slicesDir) {
		File dir = new File(slicesDir);
		File[] files = dir.listFiles();
		for (File file : files) {
			if (!file.delete()) {
				return false;
			}
		}
		return dir.delete();
	}
	
	public static boolean deleteFile(File file) {
		return file.delete();
	}
	
}
