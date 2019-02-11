package com.fest.watchtogether.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Festchellin
 * @version 1.0
 * @className Condition
 * @description
 * @date 1/22/2019  1:56 PM
 */
@Data
public class Condition implements Serializable {
	private String conditionName;
	private Object conditionValue;
}
