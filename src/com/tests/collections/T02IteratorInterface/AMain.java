package com.tests.collections.T02IteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AMain {
	public static void main(String[] args) {
		// Create a list of strings.
		List<String> names = new ArrayList<>();
		
		names.add("A");
		names.add("B");
		names.add("C");
		
		// Get an iterator for the list
		Iterator<String> nameIterator = names.iterator();
		
		// Iterate over all elements in the list.
		while (nameIterator.hasNext()) {
			// Get the next element from the list.
			String name = nameIterator.next();
			System.out.println(name);
		}
	}
}