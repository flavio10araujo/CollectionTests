package com.tests.collection.T04ForEachMethod;

import java.util.ArrayList;
import java.util.List;

public class AMain {
	public static void main(String[] args) {
		// Create a list of strings.
		List<String> names = new ArrayList<>();
		
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("F");

		names.forEach(System.out::println);
	}
}