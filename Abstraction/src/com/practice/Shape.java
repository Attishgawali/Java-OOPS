package com.practice;

abstract public class Shape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public void display() {
		System.out.println("The color is "+ color);
	}
	
	abstract public double calculateArea();
}
