package com.tests.collections.set.treeset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DMain {
	public static void main(String[] args) {
		// Sort the names based on their length, placing null first.
		TreeSet<String> names = new TreeSet<>(Comparator.nullsFirst(Comparator.comparing(String::length)));
		
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
		
		NavigableSet<String> treereverse = names.descendingSet();
		
		// Print in reverse order.
		treereverse.forEach(System.out::println);
	}
}