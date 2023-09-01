package com.training.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		int pro=1;
		int fact=sysObj.nextInt();
		for(int i=1;i<=fact;i++) {
			System.out.println(i);
			pro*=i;
		}
		System.out.println("The fact is "+pro);
	}

}
