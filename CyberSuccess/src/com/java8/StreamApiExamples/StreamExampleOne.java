package com.java8.StreamApiExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleOne {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sidharth");
		names.add("priya");
		names.add("tejas");
		names.add("Shubham");
		names.add("Sandhya");
		names.add("Sachin");
		names.add("nikhil");
		names.add("Sakshi");
		names.add("Akshay");
		names.add("Kp");
		
		//To separate the names which are starting with S.
		List<String> s_Names = names.stream()
				.filter((n)->n.startsWith("S")) //filter the data which starts with S.
				.sorted() //To sort the data.
				.map(n->n)
				//.map(n->n+" Cyber") //To add something new with the filtered data then we use the map and another data.
				.collect(Collectors.toList()); //collect the data and convert it into the form of List.
		
		System.out.println(s_Names);
		
		
		System.out.println();
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(18);
		numbers.add(44);
		numbers.add(07);
		numbers.add(25);
		numbers.add(45);
		numbers.add(40);
		numbers.add(84);
		numbers.add(99);
		numbers.add(69);
		numbers.add(21);
		
		System.out.println("Odd Numbers Square");
		List<Integer> odd_nums_Square = numbers.stream()
				.filter(n->n%2 != 0)
				.sorted()
				.map(n->n*n)
				.collect(Collectors.toList());
		
		System.out.println(odd_nums_Square);
		
			
		System.out.println("Odd Numbers");
		List<Integer> odd_nums = numbers.stream()
				.filter(n->n%2 != 0)
				.sorted()
				.map(n->n)
				.collect(Collectors.toList());
		
		System.out.println(odd_nums);
		
		System.out.println("Even Numbers");
		List<Integer> Even_nums = numbers.stream()
				.filter(n->n%2 == 0)
				.sorted()
				.map(n->n)
				.collect(Collectors.toList());
		
		System.out.println(Even_nums);
		
		//reduce()
		
		int add = numbers.stream().map(x -> x).reduce(0, (sum, n)->sum+n);
		int add2 = numbers.stream().map(x -> x).reduce(0, Integer :: sum); //method Referencing.
		System.out.println("Addition Of All :"+add);
		System.out.println("Addition Of All :"+add2);
		
		int add3 = numbers.stream().collect(Collectors.summingInt(x->x));
		System.out.println("Addition Of All :"+add3);
		
		//Average 
		double avg = numbers.stream().collect(Collectors.averagingInt(x->x));
		System.out.println(avg);
			
		//count()
		long count = numbers.stream().map(x->x).count();
		System.out.println("Count of Total Numbers :"+count);
		
		long count1 = numbers.stream().filter(n->n%2!=0).map(x->x).count();
		System.out.println("Count of Total Odd Numbers :"+count1);
	}
	

}
