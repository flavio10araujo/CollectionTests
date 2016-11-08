package com.tests.collections.T06SortedSet.T01TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DMain {
	public static void main(String[] args) {
		// Sort the names based on their length, placing null first.
		SortedSet<String> names = new TreeSet<>(Comparator.nullsFirst(Comparator.comparing(String::length)));
		
		names.add("O");
		names.add("JS");
		names.add("XML");
		names.add("JUNIT");
		names.add("HTML");
		names.add(null); // Adds a null.

		// Print the names.
		names.forEach(System.out::println);
		
		/*
		null
		O
		JS
		XML
		HTML
		JUNIT
		*/
	}
}