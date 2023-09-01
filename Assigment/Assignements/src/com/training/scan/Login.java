package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sysObj = new Scanner(System.in);
		String names[] = { "Abhi", "Arfath", "Hussain" };
		System.out.println("Enter username to login");
		String usernames = sysObj.next();
		for (int i = 0; i < names.length; i++) {
			if (usernames.equals(names[i])) {
				System.out.println("You are logged in successfully");
				break;
			} else {
				System.out.println("Invalid username");
				break;
			}
		}
	}

}
