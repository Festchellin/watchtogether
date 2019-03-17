package com.fest.watchtogether.thread;

import com.fest.watchtogether.util.FFMPEGUtils;

import java.io.File;
import java.util.concurrent.Callable;

public class FFMPEGConvertorCallable implements Callable<Boolean> {
	private File file;
	private String destination;
	
	public FFMPEGConvertorCallable(File file, String destination) {
		this.file = file;
		this.destination = destination;
	}
	
	@Override
	public Boolean call() throws Exception {
		return FFMPEGUtils.convertVideo2MP4(file, destination);
	}
}
