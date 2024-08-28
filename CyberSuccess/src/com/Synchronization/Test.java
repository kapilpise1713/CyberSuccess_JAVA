package com.Synchronization;

import com.logical.Musictest;

public class Test{
	public static void main(String[] args) {
		DrivingTest d1 = new DrivingTest();
		EatingTest e1 = new EatingTest();
		Musictest m1 = new Musictest();
		
		d1.start();
		e1.start();
		m1.start();
		
	}

}
