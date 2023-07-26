package com.practice.compiletime;

public class Main {

	public static void main(String[] args) {
		MathUtil math = new MathUtil();
		
		int result = math.add(2, 3);
		System.out.println(result); //here add method is called which has parameter int a,int b and return type result
		
		double result2 = math.add(3.0, 4.0);
		System.out.println(result2); //here add method is called which has parameter double a, double b and return type double

	}

}
