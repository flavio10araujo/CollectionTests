package com.tests.collections.T11MapInterface.T01HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BMain {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("CSS", "style");
		map.put("HTML", "mark up");
		map.put("Oracle", "database");
		map.put("XML", "data");

		// Get the set of keys.
		Set<String> keys = map.keySet();

		// Print all keys using the forEach() method.
		keys.forEach(System.out::println);
	}
}