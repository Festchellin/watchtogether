package com.fest.watchtogether.util;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class GenerateUtils {
	private static GenerateUtils ourInstance = new GenerateUtils();
	
	private GenerateUtils() {
	}
	
	public static GenerateUtils getInstance() {
		return ourInstance;
	}
	
	public static String randomUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	@Test
	public void test() {
		System.out.println(randomUUID());
	}
}
