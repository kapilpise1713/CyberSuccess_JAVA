package com.Collections.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ForwardBackward {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			Character c1 = (Character)li.next();
			System.out.println(c1);
		}
		System.out.println("End Of Forward Direction...");
		
		while(li.hasPrevious()) {
			Character c2 = (Character)li.previous();
			System.out.println(c2);
		}
		
	}

}
