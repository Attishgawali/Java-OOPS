package com.practice.singleInheritance;

public class Main {

	public static void main(String[] args) {
		
		
		Dog d = new Dog("Lucky");
		d.speak();  //o.p = the Dog barks.
		d.fetch();   //The dog fetch the ball.
		System.out.println("Name :" + d.name);    //Name :Lucky
	}

}
