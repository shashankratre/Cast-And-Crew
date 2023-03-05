package com.practice3;

import java.util.ArrayList;

class Employee
{
	String name;
	int salary;
	int id;
	
	Employee(String s , int x,int y )
	{
		name=s;
		salary=x;
		id=y;
	}
	public String toString() //necessary step
	{
	return "|Name : "+ name  + "|Salary : "+ salary + "|ID : " + id + "|\n";
	}
public static void main(String[] args) 
{
	ArrayList<Employee> l1 = new ArrayList<>();
	
	Employee e1 = new Employee("Virat",85000,1801);
	Employee e2 = new Employee("Pant",75000,1802);
	Employee e3 = new Employee("Rohit",80000,1803);
	Employee e4 = new Employee("Virat",95000,1801);
	
	l1.add(e1);
	l1.add(e2);
	l1.add(e3);
	l1.add(e4);
	
	for(Employee e : l1)
	{
		System.out.println(e);
	}

}
}


