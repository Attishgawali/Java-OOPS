package com.practice;

public class Main {

	public static void main(String[] args) {
		
		Circle c= new Circle("Red",5.0);
		c.display();
		System.out.println("the Area is : "+ c.calculateArea());
		
		Rectangle r= new Rectangle("Yellow",5.0,4.0);
		r.display();
		System.out.println("the Area is : "+ r.calculateArea());
		

	}

}
