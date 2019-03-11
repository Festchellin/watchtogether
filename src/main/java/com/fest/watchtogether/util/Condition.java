package com.fest.watchtogether.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Condition implements Serializable {
	private String conditionName;
	private Object conditionValue;
}
