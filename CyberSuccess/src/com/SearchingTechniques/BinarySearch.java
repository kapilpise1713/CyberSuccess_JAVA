package com.SearchingTechniques;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Search Number");
		int search = sc.nextInt();
		
		int start=0, last = arr.length-1;
		int mid = 0;
		int flag = 0;
		while(start<=last) {
			mid = (start + last)/2;
			
			if(search == arr[mid]) {
				flag = 1;
				break;
			}else if(search <arr[mid]) {
				last = mid -1;
				
			}else {
				start = mid + 1;
			}
		}
		if(flag == 1) {
			System.out.println("Search number Found in index ="+mid);
		}else {
			System.out.println("Number Not Found");
		}
	}

}
