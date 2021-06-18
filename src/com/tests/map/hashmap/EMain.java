package com.tests.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EMain {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("CSS", "style");
		map.put("HTML", "mark up");
		map.put("Oracle", "database");
		map.put("XML", "data");

		System.out.println("Map: " + map.toString());
		System.out.println();
		
		listKeys(map);
		System.out.println();
		
		listValues(map);
		System.out.println();
		
		listEntries(map);
	}

	public static void listKeys(Map<String, String> map) {
		System.out.println("Key Set:");
		Set<String> keys = map.keySet();
		keys.forEach(System.out::println);
	}
	
	public static void listValues(Map<String, String> map) {
		System.out.println("Values Collection:");
		Collection<String> values = map.values();
		values.forEach(System.out::println);
	}
	
	public static void listEntries(Map<String, String> map) {
		System.out.println("Entry Set:");

		// Get the entry Set.
		/*Set<Map.Entry<String, String>> entries = map.entrySet();
		
		entries.forEach((Map.Entry<String, String> entry) -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		});*/
		
		map.forEach((String key, String value) -> {
			System.out.println("key=" + key + ", value=" + value);
		});
	}
}