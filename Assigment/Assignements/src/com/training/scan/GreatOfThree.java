package com.training.scan;

import java.util.Scanner;

public class GreatOfThree {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		System.out.println("Enter the Three numbers ");
		int x=sysObj.nextInt();
		int y=sysObj.nextInt();
		int z=sysObj.nextInt();
		String a=(x>y)&&(x<y)?" x is greater":(y>z)?"y is greater":"z is greater";
		System.out.println(a);
	}

}
