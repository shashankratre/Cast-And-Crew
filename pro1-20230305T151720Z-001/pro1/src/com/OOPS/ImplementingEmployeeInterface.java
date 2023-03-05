package com.OOPS;

public class ImplementingEmployeeInterface implements Employee 
{
	public String name()
	{
		String Name = "Rahul Kumar";
		System.out.println("NAME  IS = "+ Name);
	    return Name;	
	}
	public int salary()
	{
		 int Salary = 75000;
		System.out.println("SALARY  IS = "+ Salary);
		return Salary;
		
	}
	public void workinghours()
	{
		System.out.println("WORKING HOURS  IS 40 HOURS A WEEK");
		
	}
	public void efficiency()
	{
		System.out.println("EFFICIENCY  IS 90% ");
	}

	public static void main(String[] args) 
	{
		 ImplementingEmployeeInterface  EI = new  ImplementingEmployeeInterface ();
		 EI.name();
		 EI.salary();
		 EI.workinghours();
		 EI.efficiency();

	}

}
