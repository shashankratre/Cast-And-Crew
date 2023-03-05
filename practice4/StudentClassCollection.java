package com.practice4;

import java.util.LinkedList;

public class StudentClassCollection 
{
	String name ;
	int rollno;
	int age;
	int Class;
	
	StudentClassCollection(String name, int rollno, int age, int Class)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.Class=Class;
		
	} 
/*	public String toString()  //It is not necessary to use this method to get the elements of class inside collection
	{
		System.out.println("Name : "+ name);
		System.out.println("RollNo : "+ rollno);
		System.out.println("Age : "+ age);
		System.out.println("Class : "+ Class);
		return "";
		
	}
	*/

	public static void main(String[] args)
	{
LinkedList<StudentClassCollection> l1 = new LinkedList<>();

l1.add(new StudentClassCollection("Aarav",101,8,5));
l1.add(new StudentClassCollection("Zuhi",104,10,6));
l1.add(new StudentClassCollection("Prerna",106,12,8));
l1.add(new StudentClassCollection("Zuhi",104,10,6));
l1.add(new StudentClassCollection("Avinash",101,8,5));
l1.add(new StudentClassCollection("Zuhi",106,10,6));


for(StudentClassCollection scc : l1)
{
	//System.out.println(scc);
	//We can also get the elements of class inside the collection in "for_each" loop itself,
	//but to get elements we have to call variables using object of "for_each" loop(scc) like scc.name, scc.rollno etc.
	System.out.println("Name : "+ scc.name);
	System.out.println("RollNo : "+ scc.rollno);
	System.out.println("Age : "+ scc.age);
	System.out.println("Class : "+ scc.Class);
	System.out.println("");
	
}

	}

}
