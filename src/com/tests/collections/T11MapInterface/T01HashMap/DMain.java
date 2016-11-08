package com.tests.collections.T11MapInterface.T01HashMap;

import java.util.HashMap;
import java.util.Map;

public class DMain {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("CSS", "style");
		map.put("HTML", "mark up");
		map.put("Oracle", "database");
		map.put("XML", "data");

		map.forEach((String key, String value) -> {
			System.out.println("key=" + key + ", value=" + value);
		});
	}
}