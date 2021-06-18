package com.tests.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Program to demonstrate the differences between TreeSet, HashSet and LinkedHashSet.
 */
public class SetComparision {

	public static void main(String args[]) {

		SetComparision.testingOrderOfElements();

		//SetComparision.testingInsertionPerformance();
	}

	public static void testingOrderOfElements() {
		HashSet<String> myHashSet = new HashSet<String>();
		LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> myTreeSet = new TreeSet<String>();

		for (String fruit: Arrays.asList("mango", "apple", "banana")) {
			myHashSet.add(fruit);
			myLinkedHashSet.add(fruit);
			myTreeSet.add(fruit);
		}

		// No ordering in HashSet – elements stored in random order.
		System.out.println("Ordering in HashSet :" + myHashSet);

		// Insertion order of elements – LinkedHashSet stored elements as insertion.
		System.err.println("Order of element in LinkedHashSet :" + myLinkedHashSet);

		// Should be sorted order – TreeSet stores element in sorted order.
		System.out.println("Order of objects in TreeSet :" + myTreeSet);
	}

	/**
	 * Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet.
	 */
	public static void testingInsertionPerformance() {
		
		Set<Integer> numbers = new HashSet<Integer>();
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}

		long endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in HashSet in sec : " + (endTime - startTime));

		numbers = new LinkedHashSet<Integer>();
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}
		
		endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in LinkedHashSet in sec : " + (endTime - startTime));

		numbers = new TreeSet<Integer>();
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}
		
		endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in TreeSet in sec : " + (endTime - startTime));
	}
}