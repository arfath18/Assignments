package com.objects.basics;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		
		System.out.println("Enter the first student name ");
		String name1=sysObj.nextLine();
		System.out.println("Enter the department name is ");
		String department1=sysObj.nextLine();
		System.out.println("enter the marks ");
		int[] marks1=new int[3];
		for(int i=0;i< marks1.length;i++) {
			System.out.println("marks "+ (i + 1) + ": ");
            marks1[i] = sysObj.nextInt();
		}
		
		System.out.println("Enter the name of the second student: ");
        String name2 = sysObj.nextLine();
        System.out.println("Enter the department of the second student: ");
        String department2 = sysObj.nextLine();
        System.out.println("Enter the marks of the second student: ");
        int[] marks2 = new int[3];
        for (int i = 0; i < marks2.length; i++) {
            System.out.println("Mark " + (i + 1) + ": ");
            marks2[i] = sysObj.nextInt();
        }
        Student student1=new Student(name1, department1,marks1);
        Student student2=new Student(name2,department2,marks2);
        
        student1.getDetails();
        System.out.println("grade "+student1.getGrades());
        student2.getDetails();
        System.out.println("Grade "+student2.getGrades());
        
        
	}

}
