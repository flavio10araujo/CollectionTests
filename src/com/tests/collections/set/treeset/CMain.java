package com.tests.collections.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CMain {
	
	public static void main(String[] args) {
		
		SortedSet<String> names = new TreeSet<>();
		
		names.add("HTML");
		names.add("Java");
		names.add("SQL");
		names.add("CSS");
		
		System.out.println("Sorted Set: " + names); // Sorted Set: [CSS, HTML, Java, SQL]
		System.out.println("First: " + names.first()); // First: CSS
		System.out.println("Last: " + names.last()); // Last: SQL

		SortedSet<String> ssBeforeCSS = names.headSet("CSS");
		System.out.println(ssBeforeCSS); // []

		SortedSet<String> ssBetwenCSSAndHTML = names.subSet("CSS", "HTML");
		System.out.println(ssBetwenCSSAndHTML); // [CSS]

		SortedSet<String> ssBetwenCSSAndHTML2 = names.subSet("CSS", "HTML");
		System.out.println(ssBetwenCSSAndHTML2); // [CSS]

		SortedSet<String> ssCSSAndAfter = names.tailSet("CSS");
		System.out.println(ssCSSAndAfter); // [CSS, HTML, Java, SQL]
	}
}