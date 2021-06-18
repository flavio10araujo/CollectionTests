package com.tests.collection.queue.priorityqueue.deque.linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BMain {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Java");
		// offer() will work the same as add()
		queue.offer("SQL");
		queue.offer("CSS");
		queue.offer("XML");

		System.out.println("Queue: " + queue); // Queue: [Java, SQL, CSS, XML]

		// Let's remove elements until the queue is empty.
		while (queue.peek() != null) {
			System.out.println("Head  Element: " + queue.peek());
			queue.remove();
			System.out.println("Removed one  element from  Queue");
			System.out.println("Queue: " + queue);
		}
		
		System.out.println("queue.isEmpty(): " + queue.isEmpty()); // queue.isEmpty(): true
		System.out.println("queue.peek(): " + queue.peek()); // queue.peek(): null
		System.out.println("queue.poll(): " + queue.poll()); // queue.poll(): null
		
		try {
			String str = queue.element();
			System.out.println("queue.element(): " + str);
			str = queue.remove();
			System.out.println("queue.remove(): " + str);
		}
		catch (NoSuchElementException e) {
			System.out.println("queue.remove(): Queue is  empty.");
		}
	}
}