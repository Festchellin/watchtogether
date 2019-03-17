package com.fest.watchtogether.thread;

import com.fest.watchtogether.util.FFMPEGUtils;

import java.io.File;
import java.io.IOException;

public class FFMPEGConvertorThread implements Runnable {
	private File file;
	private String destination;
	
	public FFMPEGConvertorThread(File file, String destination) {
		this.file = file;
		this.destination = destination;
	}
	
	@Override
	public void run() {
		try {
			FFMPEGUtils.convertVideo2MP4(file, destination);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
