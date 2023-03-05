package com.OOPS;

public class Encapsulation 
{
	private String name;
	private String designation;
	private int salary;
	private int age;
	
	public String name()
	{
		return name;
	}
	public String designation()
	{
		return designation;
	}
	public int salary()
	{
		return salary;
	}
	public int age()
	{
		return age;
	}
	
	public void sname(String NAME)
	{
		name = NAME;
	}
	public void sdesignation(String DESIGNATION)
	{
		designation = DESIGNATION;
	}
	public void ssalary(int SALARY)
	{
		salary = SALARY;
	}
	public void sage(int AGE)
	{
		 age=AGE;
	}


}
