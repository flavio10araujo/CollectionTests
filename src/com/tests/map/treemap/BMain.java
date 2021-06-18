package com.tests.map.treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class BMain {
	
	public static void main(String[] args) {
		
		Comparator<String> keyComparator = Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase); 

		SortedMap<String, String> sMap = new TreeMap<>(keyComparator);
		
		sMap.put("O", "lepo lepo");
		sMap.put("JS", "script");
		sMap.put("CSS3", "style");
		sMap.put("HTML5", "mark up");
		sMap.put("Oracle", "database");
		sMap.put("XML", "data");

		System.out.println(sMap); // {O=lepo lepo, JS=script, XML=data, CSS3=style, HTML5=mark up, Oracle=database}
		
		SortedMap<String, String> subMap = sMap.subMap("JS", "HTML5");
		
		System.out.println(subMap); // {JS=script, XML=data, CSS3=style}

		// Get the first and last keys
		String firstKey = sMap.firstKey();
		String lastKey = sMap.lastKey();
		System.out.println("First Key: " + firstKey);
		System.out.println("Last key: " + lastKey);
	}
}