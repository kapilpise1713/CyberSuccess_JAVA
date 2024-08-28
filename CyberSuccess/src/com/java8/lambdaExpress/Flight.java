package com.java8.lambdaExpress;

import java.util.ArrayList;
import java.util.Collections;

class FlightDetails {
	int Flightid;
	String flightName;
	double duration;
	double price;
	public FlightDetails(int flightid, String flightName, double duration, double price) {
		
		Flightid = flightid;
		this.flightName = flightName;
		this.duration = duration;
		this.price = price;
	} 
	
}	
public class Flight{
	
	public static void main(String[] args) {
		ArrayList<FlightDetails> aList = new ArrayList<FlightDetails>();
		
		FlightDetails f1 = new FlightDetails(101, "Star", 1.5, 1500.50);
		FlightDetails f2 = new FlightDetails(102, "Indigo", 2.5, 1800);
		FlightDetails f3 = new FlightDetails(103, "KingFisher", 2, 1500.50);
		FlightDetails f4 = new FlightDetails(104, "Air India", 1.2, 3500);
		FlightDetails f5 = new FlightDetails(105, "Reliance", 1.5, 1100.50);
		
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		aList.add(f4);
		aList.add(f5);
		
		Collections.sort(aList, (flight1, flight2) ->{
			return flight1.flightName.compareTo(flight2.flightName);
		});
		
		aList.forEach((m)->{
			System.out.println(m.Flightid+" "+m.flightName+" "+m.duration+" "+m.price);
		});
		
		
	
		
		
		
		
		
	}


}
