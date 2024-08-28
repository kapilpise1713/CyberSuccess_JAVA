package com.Collections.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Cyber");
		al1.add("Success");
		al1.add("Training");
		
		System.out.println("---------Normal Cursors----------");
		Iterator i1 = al1.iterator();
		while(i1.hasNext()) {
			String s1 = (String)i1.next();
			System.out.println(s1);
		}
		
		System.out.println("---------Generic Cursors---------");
		Iterator<String> i2 = al1.iterator();
		while(i2.hasNext()) {
			String s2 = i2.next();
			System.out.println(s2);
		}
	}

}
