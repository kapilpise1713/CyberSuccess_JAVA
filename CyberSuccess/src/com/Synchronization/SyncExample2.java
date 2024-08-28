package com.Synchronization;

public class SyncExample2 {
	
	public static synchronized void info(int a, int b) {
		for(int i=a;i<=b;i++) {
			int num = i;
			int count = 0;
			for (int i1 = 1; i1 <= num; i1++) {
				if (num % i1 == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num+" ");
			}
		
		}
	}
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
				info(10, 1000);
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Runnable r2 = new Runnable() {
			public void run() {
				info(10000, 15000);
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
