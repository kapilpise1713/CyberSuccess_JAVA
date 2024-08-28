package com.logical;

public class PrimeCheck_10to1000 {
	
	public static void main(String[] args) {
		for (int j = 10; j <= 1000; j++) {
              
			int num = j;
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num+" ");
			}
		}
	}

}
