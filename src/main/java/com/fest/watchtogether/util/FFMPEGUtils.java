package com.fest.watchtogether.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FFMPEGUtils {
	private static final Logger logger = LoggerFactory.getLogger(FFMPEGUtils.class);
	private static FFMPEGUtils ourInstance = new FFMPEGUtils();
	
	public static FFMPEGUtils getInstance() {
		return ourInstance;
	}
	
	public static boolean convertVideo2MP4(File file, String desc) throws IOException, InterruptedException {
		boolean success = false;
		String fileAbsolutePath = file.getAbsolutePath();
		String fileName = getFileName(file);
		List<String> command = new ArrayList<>();
		command.add("ffmpeg");
		command.add("-y");
		command.add("-i");
		command.add(fileAbsolutePath);
		command.add("-c:v");
		command.add("libx264");
		command.add(desc + "/" + fileName + ".mp4");
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		logger.info("start convert");
		Process process = processBuilder.start();
		InputStream inputStream = process.getErrorStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str = null;
		while ((str = bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
		process.waitFor();
		int exitValue = process.exitValue();
		bufferedReader.close();
		inputStreamReader.close();
		inputStream.close();
		System.out.println(exitValue);
		return exitValue == 0;
	}
	
	public static boolean isMP4(File file) {
		boolean isMP4 = false;
		String fileName = file.getName();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
		if ("mp4".equals(suffix)) isMP4 = true;
		return isMP4;
	}
	
	public static boolean canCanvert(File file) {
		String fileName = file.getName();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
		switch (suffix) {
			case "avi":
				return true;
			case "mpg":
				return true;
			case "wmv":
				return true;
			case "3gp":
				return true;
			case "mov":
				return true;
			case "mkv":
				return true;
			case "mp4":
				return true;
			case "flv":
				return true;
			case "rm":
				return true;
			case "rmvb":
				return true;
			default:
				return false;
		}
	}
	
	private static String getFileName(File file) {
		return file.getName().substring(0, file.getName().lastIndexOf("."));
	}
	
}
