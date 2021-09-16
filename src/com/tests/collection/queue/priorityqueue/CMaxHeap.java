package com.tests.collection.queue.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Por default, a classe PriorityQueue cria um min-heap.
 * Para usar um max-heap, precisa fazer o Collections.reverseOrder();
 */
public class CMaxHeap {

	public static void main(String[] args) {
		Queue<Integer> minHeap = new PriorityQueue<>();
		
		minHeap.add(10);
		minHeap.add(40);
		minHeap.add(60);
		minHeap.add(6);
		minHeap.add(15);
		
		// Como é um min-heap, o menor valor está no começo da Queue.
		// Ou seja, o 6.
		System.out.println(minHeap.poll());
		
		Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		maxHeap.add(10);
		maxHeap.add(40);
		maxHeap.add(60);
		maxHeap.add(6);
		maxHeap.add(15);
		
		// Como é um max-heap, o maior valor está no começo da Queue.
		// Ou seja, o 60.
		
		System.out.println(maxHeap.poll());
	}
}