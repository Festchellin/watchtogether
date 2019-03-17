package com.fest.watchtogether.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Response implements Serializable {
	private String message;
	private boolean success;
	private Map<String, Object> data = new HashMap<>();
}
