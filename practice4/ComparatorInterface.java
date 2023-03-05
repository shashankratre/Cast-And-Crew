package com.practice4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Student2
{
	String name;
	int rollno;
	int age;
	String section;
	int Class;

	Student2(String name, int rollno, int age, String section, int Class) 
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.section = section;
		this.Class= Class;
	}
	public String toString()
	{

		
		System.out.println("Name : " +this.name);
		System.out.println("Age : " +this.age);
		System.out.println("Class : " +this.Class);
		System.out.println("Section : " +this.section);
		System.out.println("RollNo : " +this.rollno);
		System.out.println(" ");
		return "";
	}
}
	class namesort implements Comparator<Student2>
	{
	@Override
		public int compare(Student2 o1, Student2 o2) 
		{
			
			return o1.name.compareToIgnoreCase(o2.name);
			
		}	
	}
	
	class classsort implements Comparator<Student2>
	{

		@Override
		public int compare(Student2 o1, Student2 o2) 
		{
			
			return o1.Class > o2.Class ? 1 : -1;
		}
		
	}
	
	class agesort implements Comparator<Student2>
	{

		@Override
		public int compare(Student2 o1, Student2 o2) 
		{
			
			return o1.age > o2.age ? 1 : -1;
		}
		
	}
	class sectionsort implements Comparator<Student2>
	{
	@Override
		public int compare(Student2 o1, Student2 o2) 
		{
			
			return o1.section.compareToIgnoreCase(o2.section);
			
		}	
	}
	

public class ComparatorInterface 
{
	public static void main(String[] args) 
	{
		LinkedList<Student2> ll = new LinkedList<>();
		
		ll.add(new Student2("Zainab",110,16,"C", 8));
		ll.add(new Student2("Rohan",101,10,"A", 8));
		ll.add(new Student2("Abhishek",110,13,"C", 4));
		ll.add(new Student2("Rahul",1100,20,"D", 12));
		ll.add(new Student2("Bhanu",100,8,"A", 3));
		ll.add(new Student2("Avantika",106,9,"B",7));
		ll.add(new Student2("David",201,5,"B", 10));
		ll.add(new Student2("Vibhu",10,11,"C", 9));
		
		System.out.println("Before Sorting : \n");
		Iterator<Student2> it = ll.iterator();
		while(it.hasNext())
		{
			Student2 s = (Student2)it.next();
			System.out.println(s);
		}
		
            Collections.sort(ll, new namesort());
            
            System.out.println("AFTER SORTING By NAME============  \n");
            Iterator<Student2> itr = ll.iterator();
            while(itr.hasNext())
    		{
    			Student2 s1 = (Student2)itr.next();
    			System.out.println(s1);
    		}
            
          Collections.sort(ll, new classsort());
            
            System.out.println("AFTER SORTING By CLASS============  \n");
            Iterator<Student2> itr2 = ll.iterator();
            while(itr2.hasNext())
    		{
    			Student2 s2 = (Student2)itr2.next();
    			System.out.println(s2);
    		}
            
   Collections.sort(ll, new agesort());
            
            System.out.println("AFTER SORTING By AGE============  \n");
            Iterator<Student2> itr3 = ll.iterator();
            while(itr3.hasNext())
    		{
    			Student2 s2 = (Student2)itr3.next();
    			System.out.println(s2);
    		}
            
            
         Collections.sort(ll, new sectionsort());
            
            System.out.println("AFTER SORTING By SECTION============  \n");
            Iterator<Student2> itr4 = ll.iterator();
            while(itr4.hasNext())
    		{
    			Student2 s2 = (Student2)itr4.next();
    			System.out.println(s2);
    		}

	}
}

