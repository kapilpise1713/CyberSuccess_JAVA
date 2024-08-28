package com.logical;
//N is said to be sunny number if N+1 is perfect Square.
public class Sunny_Number {
	public static void main(String[] args) {
		int num  = 8;
		int s = num  + 1;
		double ans =Math.sqrt(s);
		if((ans-Math.floor(ans))==0) {       //3.0 - 3.0 = 0
			System.out.println("sunny Number");
		}else {
			System.out.println("Not Sunny Number");
		}
		
	}

}
