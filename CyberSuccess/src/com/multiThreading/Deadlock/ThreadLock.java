package com.multiThreading.Deadlock;

public class ThreadLock {
	
	String red = "red";
	String pink = "pink";
	
	
	public void display() throws InterruptedException {
		synchronized (red) {
			System.out.println("thread lock red by display");
			Thread.sleep(1000);
			
			synchronized (pink) {
				System.out.println("Thread lock for pink by display");
				
			}
			
		}
	}
	
	public void info() throws InterruptedException {
		synchronized (pink) {
			System.out.println("thread lock pink by info");
			Thread.sleep(1000);
			
			synchronized (red) {
				System.out.println("Thread lock for red by info");
				
			}
			
		}
	}

}
