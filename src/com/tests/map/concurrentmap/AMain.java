package com.tests.map.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AMain {
	
	public static void main(String[] args) {
		
		ConcurrentMap<String, String> cMap = new ConcurrentHashMap<>();
		cMap.put("A", "A");

		System.out.println("Concurrent Map: " + cMap);

		System.out.println(cMap.putIfAbsent("A", "1"));
		System.out.println(cMap.putIfAbsent("B", "B"));
		System.out.println(cMap.remove("A", "B"));
		System.out.println(cMap.replace("A", "B"));

		System.out.println("Concurrent Map: " + cMap);
	}
}