package com.Collections.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<>();
		al1.add("Cyber");
		al1.add("Success");
		al1.add("Training");
		
		Iterator i = al1.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			String s = (String)o;
			System.out.println(s);
		}
	}

}
