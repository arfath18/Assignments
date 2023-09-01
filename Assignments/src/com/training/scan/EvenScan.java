package com.training.scan;

import java.util.Scanner;

public class EvenScan {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		System.out.println("Enter the number ");
		int even=sysObj.nextInt();
		for(int i=1;i<=even;i++) {
			if(i%2==0) System.out.println(i+" is even");
			
			
		}
	}

}
