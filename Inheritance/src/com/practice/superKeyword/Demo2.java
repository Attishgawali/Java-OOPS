package com.practice.superKeyword;

//Invoking Superclass Constructor

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand); // Invoke the superclass constructor
        this.year = year;
    }
    
    public void showDetail() {
    	System.out.println(this.brand + " " + this.year);
    }
}

public class Demo2 {

	public static void main(String[] args) {
		Car c= new Car("lambo",2022);
		c.showDetail();

	}

}
