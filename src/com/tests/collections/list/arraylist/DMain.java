package com.tests.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// The following code shows how to use the shuffle methods.
public class DMain {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("R");
		list.add("CSS");
		list.add("XML");

		System.out.println("List: " + list); // List: [Java, R, CSS, XML]
		
		Collections.sort(list);
		System.out.println("List: " + list); // List: [CSS, Java, R, XML]

		Collections.shuffle(list);
		System.out.println("List: " + list); // ?

		Collections.shuffle(list);
		System.out.println("List: " + list); // ?
	}
}