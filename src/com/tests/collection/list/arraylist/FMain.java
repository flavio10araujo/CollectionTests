package com.tests.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// The following code shows how to use the swap() method.
public class FMain {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("r");
		list.add("css");
		list.add("xml");
		list.add("HTML");
		list.add("javascript");

		System.out.println(list); // [JAVA, r, css, xml, HTML, javascript]
		
		Collections.sort(list);
		System.out.println("List: " + list); // List: [HTML, JAVA, css, javascript, r, xml]

		// Swap elements at indexes 1 and 3
		Collections.swap(list, 1, 3);
		System.out.println(list); // [HTML, javascript, css, JAVA, r, xml]
	}
}