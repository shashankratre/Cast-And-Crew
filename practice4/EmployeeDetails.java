package com.practice4;

public class EmployeeDetails
{
	String name ;
	int age ;
	int empid;
	double salary;
	EmployeeDetails(String s, int i, double j,int k)
	{
		name=s;
		empid=i;
		salary=j;
		age = k;
	}
	public String  toString()
	{
		
		System.out.printf("%15s %15s %15s %15s", name, empid, salary,age);
		return "";
	}
}