package com.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		Emp e1 = new Emp(101, "kapil");
		Stud s1 = new Stud(202, "Nilesh");	
		Integer i1 = 100;
		ArrayList al = new ArrayList<>();
		al.add(e1);
		al.add(s1);
		al.add(i1);
		
		for(Object o : al) {
			if(o instanceof Emp) {
				Emp ee = (Emp)o;
				System.out.println(ee.Empid+" - "+ee.Empname);
			}else if(o instanceof Stud) {
				Stud ss = (Stud)o;
				System.out.println(ss.Studid+" - "+ss.studName);
			}else if(o instanceof Integer) {
				Integer ii = (Integer)o;
				System.out.println(ii);
			}
		}
	}

}
