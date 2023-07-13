package com.practice;

public class Student {

	// Properties or Attirbutes or data or data members or instance variable
	int studentId;
	String studentName;
	String studentCity;

	// non-prametrize constructor
	public Student() {
		System.out.println("this is non prametrize constructor");
	}

	//Prametrize constructor
	public Student(int i) {
		System.out.println("this is prametrize constructor");
	}
	
	//constructor overrding
	public Student(int i,String n) {
		studentId=i;
		studentName=n;
	}
	
	//"this" keyword use for differce of instance variable and local variable
	public Student(int studentId, String studentName, String studentCity) {
		this.studentId = studentId;
		this.studentName= studentName;
		this.studentCity= studentCity;
	}
	
	
	//"this" keyword use for constuctor chaining
	
	public Student(String studentName) {
		this(105,studentName);
		// this will automatic invoke constructor of Student(int i,String n)
		
	}

	// Action or Method or Functions or member method or Behaviour
	public void study() {
		System.out.println(studentName + " is Studying ....");
	}

	public void showDeatail() {
		System.out.println("Student Name is : " + studentName);
		System.out.println("Student Id is : " + studentId);
		System.out.println("Student City is : " + studentCity);
	}

	

}
