package com.training.basics;

import java.util.Scanner;

public class GreatestArr {

	public static void main(String[] args) {
		int arr[] = new int[4];
		Scanner sysObj = new Scanner(System.in);
		int maxVal = arr[0];
		System.out.println("The length " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter the number ");
			arr[i] = sysObj.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("The greatest number is array is " +maxVal);
	}
}
