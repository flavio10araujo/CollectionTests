package com.tests.collection.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class AMain {
	
	public static void main(String[] args) {
		// Create a sorted set of some names.
		SortedSet<String> sortedNames = new TreeSet<>();
		
		sortedNames.add("Java");
		sortedNames.add("SQL");
		sortedNames.add("HTML");
		sortedNames.add("Java");
		sortedNames.add("CSS");

		// Print the sorted set of names.
		System.out.println(sortedNames);
		// [CSS, HTML, Java, SQL] 
		// The objects will be printed ordered by name because String implements Comparable interface.
		// The list will not have duplicates because SortedSet implements Set.
	}
}