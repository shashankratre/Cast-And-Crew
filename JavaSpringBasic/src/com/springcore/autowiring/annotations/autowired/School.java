package com.springcore.autowiring.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class School
{
	@Autowired // autowired applied on properties
	private Student student;

	public Student getStudent() 
	{
		
		return student;
	}
 //@Autowired applied on setter method
	public void setStudent(Student student)
	{
		this.student = student;
	//	System.out.println("@Autowired annotation applied on setter method...setter injection");
	}

	public School() 
	{
		super();
		System.out.println("@Autowired annotation applied on properties");
		
	}
//@Autowired applied on parameterized constructor
	public School(Student student) 
{
		super();
		this.student = student;
	//	System.out.println("@Autowired annotation applied on constructor method...constructor injection");
	}

	@Override
	public String toString() {
		return "Student Details :  " + student;
	}

}
