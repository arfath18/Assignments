package com.training.basics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int arr[]=new int[4];
		for(int i=0;i<=arr.length;i++) {
			
		int number = scanner.nextInt();

		String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
		System.out.println("Reversed number: " + reversed);
		}
		System.out.println();
	}

}
