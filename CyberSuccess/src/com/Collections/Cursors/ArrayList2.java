package com.Collections.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList aL = new ArrayList<>();
		aL.add(11);
		aL.add("Cyber");
		aL.add('A');
		//aL.add(true);
		Iterator i = aL.iterator();
		while (i.hasNext()) {
			Object o = i.next();
		    if(o instanceof Integer) {
		    	Integer i1 = (Integer)o;
		    	System.out.println(i1);
		    }else if(o instanceof String) {
		    	String s1 = (String)o;
		    	System.out.println(s1);
		    }else if(o instanceof Character) {
		    	Character c1 = (Character)o;
		    	System.out.println(c1);
		    }
			
		}
	}

}
