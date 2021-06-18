package com.tests.collection.set.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BMain {
	
	public static void main(String[] args) {
		
		SortedSet<Person> personsById = new TreeSet<>(Comparator.comparing(Person::getId));

		personsById.add(new Person(1, "X"));
		personsById.add(new Person(2, "Z"));
		personsById.add(new Person(3, "A"));
		personsById.add(new Person(4, "C"));
		personsById.add(new Person(4, "X")); // A duplicate Person.
		personsById.add(new Person(5, "Z")); // A duplicate Person.

		System.out.println("Persons by Id:");
		personsById.forEach(System.out::println);

		SortedSet<Person> personsByName = new TreeSet<>(Comparator.comparing(Person::getName));
		
		personsByName.add(new Person(1, "X"));
		personsByName.add(new Person(2, "Z"));
		personsByName.add(new Person(3, "A"));
		personsByName.add(new Person(4, "C"));
		personsByName.add(new Person(5, "X"));

		System.out.println("Persons by Name: ");
		personsByName.forEach(System.out::println);
	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
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
		if (!(o instanceof Person)) {
			return false;
		}

		// id must be the same for two Persons to be equal.
		Person p = (Person) o;
		/*if (this.id == p.getId()) {
			return true;
		}*/
		if (this.getName().equals(p.getName())) {
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
}