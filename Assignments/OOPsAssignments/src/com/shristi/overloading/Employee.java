package com.shristi.overloading;

public class Employee {
	String name;
	String designation;
	
	public  Employee(String name,String designation) {
		this.name=name;
		this.designation=designation;
	}
	
	public double calcBonus(double basicAllowance) {
		return basicAllowance*10;
	}
	public double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance*15+carAllowance*5;
		
	}
	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance*20+carAllowance*10+houseAllowance*5;
		
	}

}
