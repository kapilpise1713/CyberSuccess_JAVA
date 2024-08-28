package com.multiThreading;

public class Example3 implements Runnable{
	
	public void run() {
		System.out.println("name :"+Thread.currentThread().getName());
		System.out.println("Priority :"+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Runnable r1 = new Example3();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.setName("Shahrukh");
		t1.setPriority(2);
		
		t2.setName("Allu");
		t2.setPriority(6);
		
		t3.setName("Ranveer");
		t3.setPriority(8);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
