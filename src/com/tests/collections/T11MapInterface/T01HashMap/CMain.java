package com.tests.collections.T11MapInterface.T01HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CMain {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("CSS", "style");
		map.put("HTML", "mark up");
		map.put("Oracle", "database");
		map.put("XML", "data");

		// Get the entry Set.
		Set<Map.Entry<String, String>> entries = map.entrySet();

		entries.forEach((Map.Entry<String, String> entry) -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		});
		
		/*byte age = 39;
		Person ale = new Person("Alessandro", age);
		age = 37;
		Person lando = new Person("Orlando", age);
		age = 35;
		Person leandro = new Person("Leandro", age);
		age = 33;
		Person lena = new Person("Beatriz", age);
		
		Map<Integer, Person> siblings = new HashMap<>();
		
		map.put(1, ale);
		map.put(2, lando);*/
		
	}
}

class Person {
	private String name;
	private byte age;
	
	public Person(String name, byte age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public byte getAge() {
		return this.age;
	}
}