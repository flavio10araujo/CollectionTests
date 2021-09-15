package com.tests.collection.queue.deque.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AMain {

	public static void main(String[] args) {

		// Create a Deque and use it as QUEUE.
		Deque<String> queue = new ArrayDeque<>();

		queue.add("Oracle");
		queue.add("HTML");
		queue.add("CSS");
		queue.add("XML");

		System.out.println("Queue: " + queue); // Queue: [XML, CSS, HTML, Oracle]

		// Remove all elements from the Deque.
		while (queue.peek() != null) {
			System.out.println("Element at top: " + queue.peek());
			System.out.println("Popped: " + queue.pop());
			System.out.println("Queue: " + queue);
		}

		System.out.println("Queue is empty: " + queue.isEmpty());

		// Create a Deque and use it as STACK.
		Deque<String> stack = new ArrayDeque<>();

		stack.push("Oracle");
		stack.push("HTML");
		stack.push("CSS");
		stack.push("XML");

		System.out.println("Stack: " + stack); // Stack: [XML, CSS, HTML, Oracle]

		// Remove all elements from the Deque.
		while (stack.peek() != null) {
			System.out.println("Element at top: " + stack.peek());
			System.out.println("Popped: " + stack.pop());
			System.out.println("Stack: " + stack);
		}

		System.out.println("Stack is empty: " + stack.isEmpty());
	}
}