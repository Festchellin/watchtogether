package com.fest.watchtogether.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValidateUtils {
	private static ValidateUtils ourInstance = new ValidateUtils();
	
	private ValidateUtils() {
	}
	
	public static ValidateUtils getInstance() {
		return ourInstance;
	}
	
	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null)
			return true;
		
		if (obj instanceof CharSequence)
			return ((CharSequence) obj).length() == 0;
		
		if (obj instanceof Collection)
			return ((Collection) obj).isEmpty();
		
		if (obj instanceof Map)
			return ((Map) obj).isEmpty();
		
		if (obj instanceof Object[]) {
			Object[] object = (Object[]) obj;
			if (object.length == 0) {
				return true;
			}
			boolean empty = true;
			for (int i = 0; i < object.length; i++) {
				if (!isNullOrEmpty(object[i])) {
					empty = false;
					break;
				}
			}
			return empty;
		}
		return false;
	}
	
	@Test
	public void test() {
		System.out.println(isNullOrEmpty(null));
		System.out.println(isNullOrEmpty(""));
		System.out.println((new ArrayList<>()));
		System.out.println((new HashMap<>().put("aaa", "aaa")));
	}
}
