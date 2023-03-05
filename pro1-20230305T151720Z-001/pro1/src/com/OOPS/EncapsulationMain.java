package com.OOPS;

public class EncapsulationMain 
{

	public static void main(String[] args) 
	{
		Encapsulation encap = new Encapsulation();
		encap .sname("Rohit Kumar");
		encap.sdesignation("Project Engineer");
	//	encap.salary("ss"); we can call the method [salary or any method that has return type] but can't assign a variable (or give values to method).
	//	encap.salary();
		encap.ssalary(65000);
		encap.sage(26);
		
		System.out.println("Name is - " + encap.name());
		System.out.println("Designation is - " + encap.designation());
		System.out.println("Salary is - " + encap.salary());
		System.out.println("Age is - " + encap.age());

	}

}
