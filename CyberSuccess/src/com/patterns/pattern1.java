package com.patterns;

public class pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2 == 0) {
					System.out.print(j+" ");
				}else {
					System.out.print("k ");
				}
			}
			System.out.println();
		}
	}

}
