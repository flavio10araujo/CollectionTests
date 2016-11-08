package com.tests.collections.T08ListInterface.T01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AMain {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Oracle");
		list.add("CSS");
		list.add("XML");

		System.out.println("List: " + list); // List: [Java, Oracle, CSS, XML]

		int count = list.size();
		System.out.println("Size of List: " + count); // Size of List: 4

		// Print each element with its index
		for (int i = 0; i < count; i++) {
			String element = list.get(i);
			System.out.println("Index=" + i + ", Element=" + element);
		}

		List<String> subList = list.subList(1, 3);
		System.out.println(subList); // [Oracle, CSS]

		// Remove "CSS" from the list 
		list.remove("CSS"); // Same as list.remove(2);
		System.out.println(list); // [Java, Oracle, XML]
	}
}