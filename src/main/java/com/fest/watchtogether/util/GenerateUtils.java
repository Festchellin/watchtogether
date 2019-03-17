package com.fest.watchtogether.util;

import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	
	public static String md5Generator(String str) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("md5");
		messageDigest.reset();
		messageDigest.update(str.getBytes(Charset.forName("UTF8")));
		byte[] bytes = messageDigest.digest();
		return new String(Hex.encodeHex(bytes));
	}
	
	@Test
	public void test() throws NoSuchAlgorithmException {
		System.out.println(md5Generator("123456"));
		System.out.println(randomUUID());
	}
}
