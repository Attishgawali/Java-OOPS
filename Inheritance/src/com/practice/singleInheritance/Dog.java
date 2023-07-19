package com.practice.singleInheritance;

public class Dog extends Animal {
	//inherit attribute "name" from Animal class
	public Dog(String name) {
		super(name);
	}
	
	//override the same method of Animal class
	@Override
	public void speak() {
		System.out.println("the Dog barks.");
	}
	
	//Adding its own behaviour to Class
	public void fetch() {
		System.out.println("The dog fetch the ball.");
	}
}
