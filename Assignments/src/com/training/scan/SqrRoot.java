package com.training.scan;
import java.util.Scanner;
public class SqrRoot {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a one dimensional array of type int with size 10
        int[] numbers = new int[10];

        // Populate the array with values from scanner
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Create a new array to store the square roots
        int[] squareRoots = new int[numbers.length];

        // Calculate the square root of each number in the original array and store it in the new array
        for (int i = 0; i < numbers.length; i++) {
            squareRoots[i] = (int) Math.sqrt(numbers[i]);
        }

        // Print the new array
        System.out.println("The square roots of the numbers are: ");
        for (int i = 0; i < squareRoots.length; i++) {
            System.out.println(squareRoots[i]);
        }
    }
}
