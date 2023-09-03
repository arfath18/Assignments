package com.training.quest2;

public class Employee {
	String name;
	int employeeid;
	String city;
	
	public Employee() {
		super();
		
	}

	public Employee(String name, int employeeid, String city) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.city = city;
	}
	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeid;
	}
	public void setEmployeeId(int employeeid) {
	this.employeeid=employeeid;	
		
	}
	
	public String getCity(String city) {
		return city;
	}
	public void setCity() {
		this.city=city;
	}
	@Override

    public String toString() {

        return "Employee [name=" + name + ", employeeId=" + employeeid + ", city=" + city + "]";
	}
	
	
}
