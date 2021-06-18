package com.tests.map.treemap.navigablemap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class AMain {
	
	public static void main(String[] args) {

		NavigableMap<String, String> nMap = new TreeMap<>();
		
		nMap.put("CSS", "style");
		nMap.put("HTML", "mark up");
		nMap.put("Oracle", "database");
		nMap.put("XML", "data");
		
		System.out.println("Navigable Map: " + nMap); // Navigable Map: {CSS=style, HTML=mark up, Oracle=database, XML=data}

		Entry<String, String> lowerXML = nMap.lowerEntry("XML");
		Entry<String, String> floorXML = nMap.floorEntry("XML");
		Entry<String, String> higherXML = nMap.higherEntry("XML");
		Entry<String, String> ceilingXML = nMap.ceilingEntry("XML");

		System.out.println("Lower: " + lowerXML); // Lower: Oracle=database
		System.out.println("Floor: " + floorXML); // Floor: XML=data
		System.out.println("Higher: " + higherXML); // Higher: null
		System.out.println("Ceiling: " + ceilingXML); // Ceiling: XML=data

		// Get the reverse order view of the map.
		NavigableMap<String, String> reverseMap = nMap.descendingMap();
		System.out.println("Navigable Map(Reverse  Order): " + reverseMap); // Navigable Map(Reverse  Order): {XML=data, Oracle=database, HTML=mark up, CSS=style}
	}
}