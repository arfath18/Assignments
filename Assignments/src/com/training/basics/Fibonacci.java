package com.training.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		int num=10;
		int firstTrm=0;
		int secTrm=1;
		for (int i = 1; i <= num; ++i) {
		      System.out.print(firstTrm + ", ");
		      int nextTrm = firstTrm + secTrm;
		      firstTrm = secTrm;
		      secTrm = nextTrm;
	}

}
}