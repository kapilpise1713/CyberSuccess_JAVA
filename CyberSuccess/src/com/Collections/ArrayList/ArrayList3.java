package com.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(11);
		al1.add(22);
		al1.add(33);
		System.out.println(al1);
		
		// 1. Approach  -->Constructor
		ArrayList al2 = new ArrayList<>(al1);
		al2.add('X');
		al2.add('Y');
		al2.add('Z');
		System.out.println(al2);
		
		// 2.Approach  --> addAll()
		ArrayList al3 = new ArrayList<>();
		al3.addAll(al2);
		al3.add("Cyber");
		al3.add("Success");
		System.out.println(al3);
	}

}
