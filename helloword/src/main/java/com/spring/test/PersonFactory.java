package com.spring.test;

public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Using factory to create bean.");
		return new Person(id, name);
	}
}
