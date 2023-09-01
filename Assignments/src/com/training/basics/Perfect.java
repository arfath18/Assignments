package com.training.basics;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sysObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sysObj.nextInt();
		for (int i = 1; i <= num; i++) {
			int sum = 0;
			for (int d = 1; d < i; d++) {
				if (i % d == 0) {
					sum += d;
				}
			}
			if (sum == i) {
				System.out.println(i+" is perfect number");
			}

		}
	}

}
