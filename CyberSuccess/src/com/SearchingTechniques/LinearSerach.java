package com.SearchingTechniques;

import java.util.Scanner;

public class LinearSerach {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		int count = 0;
		int target = 77;
		
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i] == target) {
				System.out.println("Index is :"+i);
				System.out.println("Position is :"+(i+1));
				break;
			}
			
			
		}
		if(count==arr.length) {
			System.out.println("Not Present");
		}
	
		
		
	
	}

}
