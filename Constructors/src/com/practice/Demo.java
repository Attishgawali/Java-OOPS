package com.practice;

public class Demo {

	public static void main(String[] args) {

		// now creating object of student
		Student s1 = new Student();  //new keyword allocate dynamic memory to object 

		// setting object properties
		s1.studentId = 101;
		s1.studentName = "Attish";
		s1.studentCity = "Sinnar";

		// implementing method on object created

		s1.study();
		s1.showDeatail();

		
		//////
		
		// now creating another object of student
		Student s2 = new Student();

		// setting object properties
		s2.studentId = 102;
		s2.studentName = "Tejas";
		s2.studentCity = "Pune";

		// implementing method on object created

		s2.study();
		s2.showDeatail();
		
		Student s3 = new Student(9);
		s3.showDeatail();
		
		Student s4 = new Student(104,"Shubh","Nashik");
		s4.showDeatail();
	}

}
