package com.patterns;

public class pattern4 {
	public static void main(String[] args) {
		char ch  ='a';
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println();
		}
	}

}
