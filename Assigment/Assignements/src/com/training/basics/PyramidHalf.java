package com.training.basics;

public class PyramidHalf {

	public static void main(String[] args) {
		        int rows = 5; 

		        for (int i = 1; i <= rows; i++) {
		            
		            for (int j = 1; j <= rows - i; j++) {//printing space
		                System.out.print(" ");
		            }

		            
		            for (int k = 1; k <= 2 * i - 1; k++) {// Print stars
		                System.out.print("*");
		            }

		            System.out.println();
		        }
		    
		}

	}


