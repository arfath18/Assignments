package com.training.basics;


public class SmallerArr {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40};	
	int small=arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] < small) small = arr[i];	
	}
	System.out.println("The Smallest number is array is " +small);

}
}