package com.tests.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// The following code sorts the list in ascending order of the length of their elements using the sort() method in the List interface.
public class CMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("R");
		list.add("CSS");
		list.add("XML");

		System.out.println("List: " + list); // List: [Java, R, CSS, XML]

		// Uses List.sort() method with a Comparator.
		list.sort(Comparator.comparing(String::length));

		System.out.println("Sorted List: " + list); // Sorted List: [R, CSS, XML, Java]
	}
}