package com.springcore.autowiring.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Employee 
{
	private String name;
	private int salary;
	private int empid;
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Required
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee Name :  " + name + ",\nEmployee Salary :  " + salary + ",\nEmployee Id :  " + empid;
	}

}
