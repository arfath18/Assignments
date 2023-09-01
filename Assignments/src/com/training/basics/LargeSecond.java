package com.training.basics;

public class LargeSecond {
	public static void main(String[] args) {
		
	int arr[] = { 10, 20, 30, 40 };
	int large = Integer.MIN_VALUE;
	int SecLarge=Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] > large) {   
			SecLarge = large;
			large = arr[i];
		} else if (arr[i] > SecLarge && arr[i] != large) {
			SecLarge = arr[i];
		}

	}
	System.out.println(SecLarge);
	}
}

