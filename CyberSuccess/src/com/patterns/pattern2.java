package com.patterns;

public class pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int col = 0;
			for(int j=1;j<=i;j++) {
				System.out.print(col+" ");
				col = col + 3;
			}
			System.out.println();
		}
		
	}

}
