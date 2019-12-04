package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for( int x =1; x<arr.length-i; x++) {
				int temp = arr[x];
				if (arr[x]<arr[x-1]) {
					arr[x] = arr[x-1];
					arr[x-1] = temp;
				}
			}
		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
