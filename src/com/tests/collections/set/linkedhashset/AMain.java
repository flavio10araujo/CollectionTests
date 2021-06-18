package com.tests.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class AMain {
	
	public static void main(String[] args) {

		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("A");
		s1.add("D");
		
		System.out.println("LinkedHashSet: " + s1);
		// LinkedHashSet: [A, B, C, D]
		// It will print in the same order that the elements were inserted.
		// It will not add duplicate values.
	}
}