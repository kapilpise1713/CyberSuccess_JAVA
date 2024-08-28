package com.logical;
//sum of digits of square should be same as given number.
public class NeonNumber {
	public static void main(String[] args) {
		int num = 9;
		
		int ans = num * num;
		int sum  = 0;
		
		while(ans>0) {
			int rem = ans % 10;
			sum = sum + rem;
			ans = ans / 10;
			
		}
		if(num == sum) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not Neon");
		}
	}

}
