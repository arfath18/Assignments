package com.objects.basics;

public class Student {
	String name;
	String department;
	int[] marks;
	
	public Student(String name, String department,int[] marks ) {
		this.name = name;
		this.department = department;
		this.marks=marks;
	}
	public void getDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Department: " + this.department);
	}
	public String getGrades() {
		int sum=0;
		for(int mark:this.marks) {
			sum+=mark;
		}
		float average = sum / this.marks.length;
		
		String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        return grade;
    }



		
	}



