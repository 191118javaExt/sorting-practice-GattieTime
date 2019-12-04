package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int mid = (arr.length/2);
		int [] left = new int[mid];
		int [] right = new int [arr.length - mid];
		
		for (int i = 0; i<mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i<arr.length; i++) {
			right[i-mid] = arr[i];
		}
		
		sort(left);
		sort(right);
		
		merge(arr, left, right);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int r = 0;
		int l = 0;
		
		
		while(r<right.length && l<left.length) {
			if(left[l] < right[r]) {
				arr[l+r] = left[l];
				l++;
			}else {
				arr[l+r]=right[r];
				r++;
			}
		}
		
		for(; l<left.length; l++) {
			arr[l+r] = left[l];
		}
		for(; r<right.length; r++) {
			arr[l+r] = right[r];
		}
		
	}
}
