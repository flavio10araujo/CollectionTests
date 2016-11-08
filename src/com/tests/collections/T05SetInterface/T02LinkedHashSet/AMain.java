package com.tests.collections.T05SetInterface.T02LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class AMain {
	
	public static void main(String[] args) {

		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		
		System.out.println("LinkedHashSet: " + s1);
	}
}