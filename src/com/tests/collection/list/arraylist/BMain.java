package com.tests.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// The following code demonstrates how to sort a List.
public class BMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("J");
		list.add("R");
		list.add("C");
		list.add("X");

		System.out.println("List: " + list); // List: [J, R, C, X]

		// Uses Comparable implementation in String class to sort the list in natural order.
		Collections.sort(list);
		System.out.println("Sorted List: " + list); // Sorted List: [C, J, R, X]
	}
}