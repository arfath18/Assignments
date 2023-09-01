package com.training.basics;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
        System.out.println("Reversed number: " + reversed);
	}

}
