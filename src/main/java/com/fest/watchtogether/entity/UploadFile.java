package com.fest.watchtogether.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
public class UploadFile implements Serializable {
	private String md5;
	private String filename;
	private transient MultipartFile file;
	private int totalSlices;
	private int currentSlice;
}
