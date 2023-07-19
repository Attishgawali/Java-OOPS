package com.practice.superKeyword;

//Accessing Superclass Members:

class Animal{
	public void makeSound() {
		System.out.println("The animal make a sound");
	}	
}

class Dog extends Animal{
	public void makeSound() {
		super.makeSound(); // Call the makeSound() method of the superclass
		System.out.println("the dog barks");
	}
}
public class Demo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();

	}

}
