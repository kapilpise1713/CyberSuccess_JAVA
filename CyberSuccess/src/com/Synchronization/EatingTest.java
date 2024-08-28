package com.Synchronization;

public class EatingTest extends Thread{
	public void display() {
		System.out.println("I am Eating Biryani");
	}
	
	public void run() {
		display();
	}

}
