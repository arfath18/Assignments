package com.training.basics;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 1, 2, 5 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			// Check if the current element is a duplicate.
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					break;
				}
			}
		}

		// Print the number of duplicates.
		System.out.println("The number of duplicates is: " + count);
	}
}
