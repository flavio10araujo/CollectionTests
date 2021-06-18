package com.tests.collection.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class ComparablePerson2 implements Comparable<ComparablePerson> {

	private int id;
	private String name;

	public ComparablePerson2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ComparablePerson)) {
			return false;
		}
		ComparablePerson p = (ComparablePerson) o;
		if (this.id == p.getId()) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "(" + id + ", " + name + ")";
	}

	@Override
	public int compareTo(ComparablePerson cp) {

		int cpId = cp.getId();
		String cpName = cp.getName();

		if (this.getId() < cpId) {
			return -1;
		}

		if (this.getId() > cpId) {
			return 1;
		}

		if (this.getId() == cpId) {
			return this.getName().compareTo(cpName);
		}

		// Should not reach here
		return 0;
	}
}

public class BMain {
	
	public static void main(String[] args) {
		
		int initialCapacity = 5;
		Comparator<ComparablePerson2> nameComparator = Comparator.comparing(ComparablePerson2::getName);

		Queue<ComparablePerson2> pq = new PriorityQueue<>(initialCapacity, nameComparator);
		
		pq.add(new ComparablePerson2(1, "Oracle"));
		pq.add(new ComparablePerson2(4, "XML"));
		pq.add(new ComparablePerson2(2, "HTML"));
		pq.add(new ComparablePerson2(3, "CSS"));
		pq.add(new ComparablePerson2(4, "Java"));

		System.out.println("Priority queue: " + pq); // Priority queue: [(3, CSS), (2, HTML), (1, Oracle), (4, XML), (4, Java)]

		while (pq.peek() != null) {
			System.out.println("Head  Element: " + pq.peek());
			pq.remove();
			System.out.println("Removed one  element from  Queue");
			System.out.println("Priority  queue: " + pq);
		}
	}
}