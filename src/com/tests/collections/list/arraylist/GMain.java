package com.tests.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//The following code shows how to use the rotate() method.
public class GMain {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("R");
		list.add("CSS");
		list.add("XML");

		System.out.println("List: " + list); // List: [Java, R, CSS, XML]
		
		Collections.sort(list);
		System.out.println("List: " + list); // List: [CSS, Java, R, XML]

		// Rotate elements by 2
		Collections.rotate(list, 2);
		System.out.println("After Rotating by 2: " + list); // After Rotating by 2: [R, XML, CSS, Java]
	}
}