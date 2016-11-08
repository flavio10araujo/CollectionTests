package com.tests.collections.T03ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class AMain {
	public static void main(String[] args) {
		// Create a list of strings.
		List<String> names = new ArrayList<>();
		
		names.add("A");
		names.add("B");
		names.add("C");

		for (String name : names) {
			System.out.println(name);
		}
	}
}