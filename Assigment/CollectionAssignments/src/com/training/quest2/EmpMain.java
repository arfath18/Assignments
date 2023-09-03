package com.training.quest2;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> employee =new ArrayList<>(Arrays.asList(
				new Employee("Raj",123,"BZA"),
				new Employee("Rai",124,"Hubli"),
				new Employee("Raja",127,"BANGLORE")
				
				));
		System.out.println("Employee Details");
        for (Employee emp : employee) {
            System.out.println(emp);
        }
        ArrayList<Employee> employee1 = new ArrayList<>();

        for (Employee emp1: employee) {
            if(emp1.city.equals("Banglore")) {
                employee1.add(emp1);
                System.out.println(employee);
            }
        }
       	System.out.println();
        System.out.println("Employee details based on location");
        for (Employee emp2 : employee1) {
            System.out.println(emp2);
        }
	}

}
