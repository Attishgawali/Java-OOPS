package com.practice;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345");
		System.out.println("Initial balance: Rs." + account.getBalance());
		
		account.deposite(10000.0);
		account.withdraw(200.0);
		account.withdraw(2000.0);
		
		System.out.println("Final balance: Rs." + account.getBalance());
	}

}
