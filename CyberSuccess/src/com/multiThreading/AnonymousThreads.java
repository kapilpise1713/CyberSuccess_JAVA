package com.multiThreading;

public class AnonymousThreads {
	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			public void run() {
				System.out.println("Dhoni fan");
				
			}
		};
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new Runnable() {
			
			public void run() {
				System.out.println("Kohli Fan");
				
			}
		};
		Thread t2 = new Thread(r2);
		
		Runnable r3 = new Runnable() {
			
			public void run() {
				System.out.println("Rohit Fan");
				
			}
		};
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
