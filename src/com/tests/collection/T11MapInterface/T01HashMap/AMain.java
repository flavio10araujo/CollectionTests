package com.tests.collection.T11MapInterface.T01HashMap;

import java.util.HashMap;
import java.util.Map;

public class AMain {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("CSS", "style");
		map.put("HTML", "mark up");
		map.put("Oracle", "database");
		map.put("XML", "data");
		map.put("CSS3", "style");

		printDetails(map);
		map.clear();
		printDetails(map);
	}

	public static void printDetails(Map<String, String> map) {
		String usage = map.get("CSS");
		System.out.println("Map: " + map); // 1) Map: {CSS=style, XML=data, HTML=mark up, Oracle=database} 2) Map: {}
		System.out.println("Map Size: " + map.size()); // 1) Map Size: 4 2) Map Size: 0
		System.out.println("Map is empty: " + map.isEmpty()); // 1) Map is empty: false 2) Map is empty: true
		System.out.println("Map contains CSS key: " + map.containsKey("CSS")); // 1) Map contains CSS key: true 2) Map contains CSS key: false
		System.out.println("Usage: " + usage); // 1) Usage: style 2) Usage: null
		System.out.println("removed: " + map.remove("CSS")); // 1) removed: style 2 ) removed: null
	}
}