package com.logical;

public class SpecialNo {
	public static void main(String[] args) {
		int num = 145;  //40585
		int copy= num;
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			
			int fact = 1;
			for(int i=1;i<=rem;i++) {
				fact = fact * i;
			}
			sum = sum + fact;
		
			num = num / 10;
			
		}
		//System.out.println(sum);
		if(sum == copy) {
			System.out.println("Peterson / Special");  //145 -->1! + 4! + 5! = 145
		}else {
			System.out.println("Not a Special Number");
		}
	}

}
