package com.tests.collection.T02IteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CMain {
	public static void main(String[] args) {
		// Create a list of strings.
		List<String> names = new ArrayList<>();
		
		names.add("A");
		names.add("B");
		names.add("C");

		Iterator<String> nameIterator = names.iterator();
		
		nameIterator.forEachRemaining(System.out::println);
	}
}