package com.training.scan;

import java.util.Scanner;

public class SmallestThree {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		System.out.println("Enter the Three numbers ");
		int x=sysObj.nextInt();
		int y=sysObj.nextInt();
		int z=sysObj.nextInt();
		String a=(x<y)&&(x>y)?" x is Smaller":(y<z)?"y is Smaller":"z is Smaller";
		System.out.println(a);
	}

}
