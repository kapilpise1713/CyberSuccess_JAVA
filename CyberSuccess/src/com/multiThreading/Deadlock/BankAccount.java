package com.multiThreading.Deadlock;

public class BankAccount extends Thread {
	int balance  =1000;
	
	public synchronized void withdraw(int amount) throws InterruptedException {
		if(balance < 250) {
			System.out.println("Insufficient Balance , Unable to Proceed your request");
			wait();
		}
		balance -= amount;
		System.out.println("New balance after Withdrawal = "+balance);
		
	}
	
	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println("New balance after Deposit = "+balance);
		notify();
		
	}
	
	
}
