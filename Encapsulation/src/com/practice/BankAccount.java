package com.practice;


public class BankAccount {
	private String AccountNumber;
	private double balance;
	
	public BankAccount(String accountNumber) {
		this.AccountNumber=accountNumber;
		this.balance=0.0;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposite(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Rs."+amount+ " Deposited Successfully. Your Current Balance is Rs.: " +balance);
		}
		else {
			System.out.println("Invalid Deposited Number");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance-=amount;
			System.out.println("Rs."+amount+ " Deposited Successfully. Your Current Balance is Rs.: "+ balance);
		}
		else {
			System.out.println("You Insufficient Balance");
		}
	}
	
	
}
