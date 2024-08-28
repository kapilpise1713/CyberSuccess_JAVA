package com.multiThreading.Deadlock;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		
		ThreadLock t1 = new ThreadLock();
		Thread th1 = new Thread() {
			public void run() {
				try {
					t1.display();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		};
		
		
		Thread th2 = new Thread() {
			public void run() {
				try {
					t1.info();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		};
		
		th1.start();
		//th1.join();
		th2.start();
				
	
	
	}

}
