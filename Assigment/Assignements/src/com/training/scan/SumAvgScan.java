package com.training.scan;

import java.util.Scanner;

public class SumAvgScan {

	public static void main(String[] args) {
		int arr[]=new int[4];
		int n=arr.length;
		int sum=0;
		int avg=0;
		
		Scanner sysObj=new Scanner(System.in);
		
		System.out.println("enter the number ");
		int sc=sysObj.nextInt();
		for(int i=1;i<n;i++) {
			arr[i]=sysObj.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of numbers is "+sum);
		avg=sum/n;
		System.out.println("The average of number is "+avg);
	}

}
