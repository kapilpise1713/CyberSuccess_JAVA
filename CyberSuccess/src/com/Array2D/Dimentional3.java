package com.Array2D;

import java.util.Scanner;

public class Dimentional3 {
	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3];
		
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Enter Array elements");
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		for(int k=0;k<3;k++) {	
	    		arr[i][j][k] = scanner.nextInt();
	    		
	    	}
	    }
	    }
	    
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		for(int k=0;k<3;k++) {	
	    		System.out.println(arr[i][j][k]+" ");
	    		
	    	}
	    		System.out.println();
	    }
	    }
	}


}
