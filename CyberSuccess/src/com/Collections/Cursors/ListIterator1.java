package com.Collections.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<>();
		al1.add('X');
		al1.add('Y');
		al1.add('Z');
		ListIterator li = al1.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			Character c = (Character)o;
			System.out.println(c);
		}
	}

}
