package com.tests.collections.set.treeset.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AMain {
	
	public static void main(String[] args) {
		
		NavigableSet<Integer> ns = new TreeSet<>();
		
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);

		// Get a reverse view of the navigable set.
		NavigableSet<Integer> reverseNs = ns.descendingSet();

		// Print the normal and reverse views
		System.out.println("Normal order: " + ns); // Normal order: [0, 1, 2, 3, 4, 5, 6]
		System.out.println("Reverse order: " + reverseNs); // Reverse order: [6, 5, 4, 3, 2, 1, 0]

		NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or more:  " + threeOrMore); // 3 or more:  [3, 4, 5, 6]
		
		System.out.println("lower(3): " + ns.lower(3)); // lower(3): 2
		
		System.out.println("floor(3): " + ns.floor(3)); // floor(3): 3
		
		System.out.println("higher(3): " + ns.higher(3)); // higher(3): 4
		
		System.out.println("ceiling(3): " + ns.ceiling(3)); // ceiling(3): 3

		System.out.println("pollFirst(): " + ns.pollFirst()); // pollFirst(): 0
		
		System.out.println("Navigable Set: " + ns); // Navigable Set: [1, 2, 3, 4, 5, 6]

		System.out.println("pollLast(): " + ns.pollLast()); // pollLast(): 6
		
		System.out.println("Navigable Set:  " + ns); // Navigable Set:  [1, 2, 3, 4, 5]

		System.out.println("pollFirst(): " + ns.pollFirst()); // pollFirst(): 1
		
		System.out.println("Navigable Set:  " + ns); // Navigable Set:  [2, 3, 4, 5]

		System.out.println("pollFirst(): " + ns.pollFirst()); // pollFirst(): 2
		
		System.out.println("Navigable Set:  " + ns); // Navigable Set:  [3, 4, 5]

		System.out.println("pollFirst(): " + ns.pollFirst()); // pollFirst(): 3
		
		System.out.println("Navigable Set:  " + ns); // Navigable Set:  [4, 5]

		System.out.println("pollFirst(): " + ns.pollFirst()); // pollFirst(): 4
		
		System.out.println("pollLast(): " + ns.pollLast()); // pollLast(): 5
	}
}