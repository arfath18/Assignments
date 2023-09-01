package com.training.basics;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[]= new int[]{40,55,22,44,65};
		Arrays.sort(arr);
		System.out.println("Elements in the ascending order are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
