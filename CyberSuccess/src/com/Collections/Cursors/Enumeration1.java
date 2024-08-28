package com.Collections.Cursors;

import java.util.Enumeration;
import java.util.Vector;
//Three Types of Cursors - > 1)Enumeration. 2)Iterator 3)ListIterator.
public class Enumeration1 {
	public static void main(String[] args) {
		Vector v1 = new Vector<>();
		v1.add(11);
		v1.add(22);
		v1.add(33);
		v1.add(44);
		System.out.println(v1);
		
		Enumeration e = v1.elements();
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			Integer i=(Integer)o;
			System.out.println(i);
		}
	}

}
