package com.practice4;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>
{
	String name ;
	int rollno;
	int age;
	int Class;
	
	Student(String name, int rollno, int age, int Class)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.Class=Class;
		
	}
	public String toString()
	{
		System.out.println("Name : "+ name);
		System.out.println("RollNo : "+ rollno);
		System.out.println("Age : "+ age);
		System.out.println("Class : "+ Class);
		return "";
		
	}
	
	@Override
	public int compareTo(Student s) 
	{
		return age>s.age ? 1:-1;
	}
}
public class ComparableInterface 
{
	public static void main(String[] args) 
	{
		LinkedList<Student> l1 = new LinkedList<>();

		l1.add(new Student("Aarav",101,8,5));
		l1.add(new Student("Zuhi",104,10,6));
		l1.add(new Student("Prerna",106,12,8));
		l1.add(new Student("Zuhi",104,11,6));
		l1.add(new Student("Avinash",101,7,5));
		l1.add(new Student("Zuhi",106,13,6));
		
        Collections.sort(l1);
		for(Student s : l1)
		{
			System.out.println(s);
		}
	}
}
