package com.practice.singleInheritance;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("the animal speaks.");
	}
}
