package com.tests.collections.T11MapInterface.T02SortedMapInterface.T01TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class AMain {
	
	public static void main(String[] args) {
		
		SortedMap<String, String> sMap = new TreeMap<>();
		
		sMap.put("CSS", "style");
		sMap.put("HTML", "mark up");
		sMap.put("Oracle", "database");
		sMap.put("XML", "data");

		System.out.println(sMap); // {CSS=style, HTML=mark up, Oracle=database, XML=data}
		
		SortedMap<String, String> subMap = sMap.subMap("CSS", "Oracle");
		
		System.out.println(subMap); // {CSS=style, HTML=mark up}

		// Get the first and last keys
		String firstKey = sMap.firstKey();
		String lastKey = sMap.lastKey();
		System.out.println("First Key: " + firstKey); // First Key: CSS
		System.out.println("Last key: " + lastKey); // Last key: XML
	}
}