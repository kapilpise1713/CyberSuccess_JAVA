package com.multiThreading;

public class DaemonThreadEx extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread()+" - This is a Deamon Thread");
		}else {
			System.out.println(Thread.currentThread()+" - This is a User Thread");
		}
	}
	
	public static void main(String[] args) {
		DaemonThreadEx t1 = new DaemonThreadEx();
		DaemonThreadEx t2 = new DaemonThreadEx();
		DaemonThreadEx t3 = new DaemonThreadEx();
		
		t1.setDaemon(true); //here we have set the t1 thread as a daemon Thread.
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
