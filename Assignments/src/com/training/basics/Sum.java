package com.training.basics;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number ");
		int sumof=sysObj.nextInt();
		for(int i=1;i<=sumof;i++) {
			System.out.println(i);
			sum+=i;
			 
		}
		System.out.println("The sum of numbers is "+sum);
		int avg=sum/sumof;
		System.out.println("The average of number is "+avg);
	}

}
