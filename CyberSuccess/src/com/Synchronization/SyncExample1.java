package com.Synchronization;

public class SyncExample1 extends Thread {
	public static synchronized void display() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	
	public void run() {
		display();
		
	}
	public static void main(String[] args) {
		SyncExample1 t1 = new SyncExample1();
		SyncExample1 t2 = new SyncExample1();
		SyncExample1 t3 = new SyncExample1();
		SyncExample1 t4 = new SyncExample1();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}













//when we make a display method as a synchronized then the execution of threads will happen sequentially one after another.
//But if we dont make a method as synchronized then the execution of threads will happen in any order not sequentially.