package com.java8.lambdaExpress;

import java.util.ArrayList;
import java.util.Collections;

public class MovieList {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		Movie mov1 = new Movie("Slam Book", 2008, 9.5, "Akshay");
		Movie mov2 = new Movie("Sitaraman", 2022, 9.0, "Salman");
		Movie mov3 = new Movie("Bramhastra", 2019, 8.7, "Bobby");
		Movie mov4 = new Movie("Avangers", 2012, 8.5, "Tiger");
		Movie mov5 = new Movie("KGF", 2023, 9.9, "YASH");
		
		movies.add(mov1);
		movies.add(mov2);
		movies.add(mov3);
		movies.add(mov4);
		movies.add(mov5);
		
		
		Collections.sort(movies,(movie1, movie2) ->{
//			//Sorting Based on YOR in Simple Approach.
//			if(movie1.yor > movie2.yor) {
//				return 1;
//			}else if(movie1.yor < movie2.yor) {
//				return -1;
//				
//			}else{
//				return 0;
//				
//			}
			
			
			
			
			//Sorting Based On Name
			return movie1.name.compareTo(movie2.name);
		});
		
		

		
	
	    
		movies.forEach((m)->{
			System.out.println(m.name+" "+m.yor+" "+m.iMDB+" "+m.actor);
		});
		

		
	}


}
