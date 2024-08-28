package com.java8.lambdaExpress;

public class ThreadLambda {
	public static void main(String[] args) {
		
		//Normal By Using Anonymous method.
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread());	
			}
		};
		Thread t1 = new Thread(r1, "ChinnaSwami");
		t1.start();
		
		
		//By Using Lambda Expression.
		Runnable r2 = ()->System.out.println(Thread.currentThread());
		
		Thread t2 = new Thread(r2, "MuttuSwami");
		Thread t3 = new Thread(r2, "Venu Gopal");
		Thread t4 = new Thread(r2, "Iyer");
		
		t2.start();
		t3.start();
		t4.start();
		
	}

}
