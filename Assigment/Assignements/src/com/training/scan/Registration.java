package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		String names[]= {"Arfath","rahul","Atif","Ram"};
		String usernames =sysObj.next();
		
		for(int i =0;i<names.length;i++) {
			if(usernames.equals(names[i])){
				System.out.println("It is not a unique name ");
				break;
			}else {
				System.out.println("Your are registered ");
				break;
			}
		}
	}

}
