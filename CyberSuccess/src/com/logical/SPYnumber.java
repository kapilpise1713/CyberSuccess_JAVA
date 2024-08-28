package com.logical;

//sum of digits and product of digits will be same.
public class SPYnumber {
	public static void main(String[] args) {
		int num  =123;    //123--> 1*2*3 = 6  && 1+2+3 = 6
		int sum = 0,product = 1;
		while(num>0) {
			int rem = num % 10;
			
			sum  = sum + rem;
			product = product * rem;
			num = num / 10;
			
			
		}
		if(sum == product) {
			System.out.println("SPY NUmber");
		}else{
			System.out.println("Not Spy");
		}
	}

}
