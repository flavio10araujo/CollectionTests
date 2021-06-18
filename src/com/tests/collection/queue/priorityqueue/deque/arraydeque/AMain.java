package com.tests.collection.queue.priorityqueue.deque.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AMain {
	
	public static void main(String[] args) {
		
		// Create a Deque and use it as stack.
		Deque<String> deque = new ArrayDeque<>();
		
		deque.push("Oracle");
		deque.push("HTML");
		deque.push("CSS");
		deque.push("XML");

		System.out.println("Stack: " + deque); // Stack: [XML, CSS, HTML, Oracle]

		// Remove all elements from the Deque.
		while (deque.peek() != null) {
			System.out.println("Element at top: " + deque.peek());
			System.out.println("Popped: " + deque.pop());
			System.out.println("Stack: " + deque);
		}

		System.out.println("Stack is empty: " + deque.isEmpty());
	}
}