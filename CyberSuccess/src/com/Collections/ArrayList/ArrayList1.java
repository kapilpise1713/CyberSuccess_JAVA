package com.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(22);   //int -> INTEGER ->toString()
		al.add("Cyber"); //String -> toString()
		al.add(11.5f); //float ->FLOAT -> toString()
		al.add('C');// char -> CHARACTER ->toString()
		al.add(null);
		al.add(true); // boolean ->BOOLEAN ->toString()
		System.out.println(al);
		al.add(22);
		al.add("Cyber");
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains('C'));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
	}

}
