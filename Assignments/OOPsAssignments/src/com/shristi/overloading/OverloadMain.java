package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		System.out.println("Enter the Employee name ");
		String name=sysObj.nextLine();
		System.out.println("Enter the employee designation ");
		String designation=sysObj.nextLine();
		
		Employee employee=new Employee(name, designation);
		double bonus;
		switch (designation) {
			case "programmer": 
				bonus=employee.calcBonus(1000);
				break;
			case "Manager":
				bonus=employee.calcBonus(1500, 500);
				break;
				case "Director":
				bonus=employee.calcBonus(2000, 1000,500);
				break;
				default:
					bonus=0;
		}

		System.out.println("The bonus for name is "+name+" is "+bonus);
	}
	}
