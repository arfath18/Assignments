package com.training.quest2;

import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employee =new ArrayList<>(Arrays.asList(
				new Employee("Arfath",123,"BZA"),
				new Employee("Hussain",124,"Hubli"),
				new Employee("Shaik",127,"BANGLORE"),
				new Employee("Kumar",127,"Guntur"),
				new Employee("vinay",127,"Hyderabad")
				
				));
		System.out.println("Employee Details");
        for (Employee emp : employee) {
            System.out.println(emp);
        }
        ArrayList<Employee> employee1 = new ArrayList<>(Arrays.asList(
        		new Employee ("arfath",1245,"gunt")));

        for (Employee emp1: employee) {
            if(emp1.city.equals("Guntur")) {
                employee1.add(emp1);
            }
        }
       	System.out.println();
        System.out.println("Employee details based on location");
        for (Employee emp2 : employee1) {
            System.out.println(emp2);
        }
	}

}
