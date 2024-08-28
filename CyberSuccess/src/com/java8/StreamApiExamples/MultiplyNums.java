package com.java8.StreamApiExamples;

import java.util.ArrayList;
import java.util.List;

public class MultiplyNums {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		
		int Product = numbers.stream().map(x -> x).reduce(1, (product, n)->product*n);
		System.out.println(Product);
		
		int fact = numbers.stream().map(x -> x).reduce(1, (fac, n)->fac*n);
		System.out.println(fact);
	}

}
