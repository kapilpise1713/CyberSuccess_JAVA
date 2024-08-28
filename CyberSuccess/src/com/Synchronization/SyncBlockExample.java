package com.Synchronization;

public class SyncBlockExample {
	
	public void info(int a, int b) {
		System.out.println("Before Synchronized Block");
		synchronized (this) {
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
			
		}
		System.out.println("After Synchronized Block");
		
	}
	
	public static void main(String[] args) {
		SyncBlockExample sb = new SyncBlockExample();
		Runnable r1 = new Runnable() {
			public void run() {
				sb.info(10, 20);
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Runnable r2 = new Runnable() {
			public void run() {
				sb.info(30, 40);
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
		
	
}



















//when we want to all content as a syncronizedd then we use Synchronized method.
//But when we want make any particular block as a synchronized then we use the Synchronized BLock;