package com.multiThreading.Deadlock;


public class TestClassBank {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	BankAccount bank = new BankAccount();
	
	Thread t11 = new Thread() {
		
		public void run() {
			for(int i=1;i<=5;i++) {
				try {
					bank.withdraw(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	};
	
	Thread t22 = new Thread() {
		public void run() {
			for(int i=1;i<=5;i++) {
				bank.deposit(200);
				
			}
		}
		
	};
		
	
	
	t11.start();
	t22.join();
	t22.start();
	
	
	
	
	
	}
	
	
}


