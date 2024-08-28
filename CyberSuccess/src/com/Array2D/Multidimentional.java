package com.Array2D;

import java.util.Scanner;

public class Multidimentional {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Enter Array elements");
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		arr[i][j] = scanner.nextInt();
	    	}
	    }
	    
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.print(arr[i][j]+" ");
	    		
	    	}
	    	System.out.println(" ");
	    }
	    System.out.println(" ");
	}

}
