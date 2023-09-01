package com.training.basics;

public class SmallSecond {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int small = Integer.MAX_VALUE;
		int SecSmall = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {   
				SecSmall = small;
				small = arr[i];
			} else if (arr[i] < SecSmall && arr[i] != small) {
				SecSmall = arr[i];
			}

		}
		System.out.println(SecSmall);
	}

}
