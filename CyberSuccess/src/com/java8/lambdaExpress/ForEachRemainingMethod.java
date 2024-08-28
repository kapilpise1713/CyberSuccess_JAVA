package com.java8.lambdaExpress;

import java.util.ArrayList;

import java.util.Collections;

public class ForEachRemainingMethod {
	public static void main(String[] args) {
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Slam Book");
		movies.add("SitaRaman");
		movies.add("Bramhastra");
		movies.add("Avengers");
		movies.add("KGF");
		
		
		//For Each Loop.
//		for(String m : movies) {
//			System.out.println(m);
//		}
		
		//ForEachRemaining Meethod to Print the Items.
		movies.forEach((m) ->System.out.println(m));
	}

}
