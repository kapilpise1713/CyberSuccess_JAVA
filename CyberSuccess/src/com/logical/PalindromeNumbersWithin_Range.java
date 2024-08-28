package com.logical;

public class PalindromeNumbersWithin_Range {
	public static void main(String[] args) {
		
		for(int j=11;j<=200;j++) {
			int num = j;
			int copy=num;
			int ans = 0;
			while(num>0) {
				int rem = num % 10;
				ans = ans*10+rem;
				num = num/10;
				
				if(ans == copy) {
					System.out.print(ans+" ");
				}
			}
			
		}
	}

}

//Armstrong + prime -->1 to 100000
//prime + palindrome --> 1 to 100000
