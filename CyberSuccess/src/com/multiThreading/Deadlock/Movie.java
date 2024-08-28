package com.multiThreading.Deadlock;

public class Movie {
	int seats = 10;
	
	public void book(int ticket) throws InterruptedException {
		if(seats < 4) {
			System.out.println("Less Seats please wait");
			wait();
		}
		seats -= ticket;
		System.out.println("Seats after Booking = "+seats);
	}
	

}
