package com.fest.watchtogether;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FFMPEGTest {
	public static void main(String[] args) {
		try {
			List<String> commend = new ArrayList<>();
			commend.add("ffmpeg");
			commend.add("-y");
			commend.add("-i");
			commend.add("F:\\Videos\\Mine\\haiwang.mkv");
			commend.add("output.mp4");
			ProcessBuilder builder = new ProcessBuilder(commend);
			Process process = builder.start();
			InputStream inputStream = process.getErrorStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
			int waitFor = process.waitFor();
			int i = process.exitValue();
			System.out.println(i + ":" + waitFor);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
