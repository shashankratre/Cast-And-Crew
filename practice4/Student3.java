package com.practice4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Student3
{
	String name;
	int rollno;
	int age;
	String section;
	int Class;

	public Student3(String name, int rollno, int age, String section, int Class) 
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.section = section;
		this.Class= Class;
	}
	
	public String toString()
	{
		/*
		 * System.out.println("Name : " +this.name); System.out.println("Age : "
		 * +this.age); System.out.println("Class : " +this.Class);
		 * System.out.println("Section : " +this.section);
		 * System.out.println("RollNo : " +this.rollno); System.out.println(" ");
		 */
		return "Name : " + name + ", Age : " + age;
	}
 static class MultipleSorting  implements Comparator<Student3>
{

	@Override
	public int compare(Student3 o1, Student3 o2) 
	{
		int NameCompare = o1.name.compareToIgnoreCase(o2.name);
		int AgeCompare =  (o1.age > o2.age)? -1:1;
		
		return (NameCompare == 0)?  AgeCompare:NameCompare ;	
	}
}

	public static void main(String[] args) 
	{
LinkedList<Student3> ll = new LinkedList<>();
		
		ll.add(new Student3("Zainab",110,16,"C", 8));
		ll.add(new Student3("Rohan",101,10,"A", 8));
		ll.add(new Student3("Abhishek",110,13,"C", 4));
		ll.add(new Student3("Rahul",1100,20,"D", 12));
		ll.add(new Student3("Bhanu",100,8,"A", 3));
		ll.add(new Student3("Avantika",106,9,"B",7));
		ll.add(new Student3("David",201,5,"B", 10));
		ll.add(new Student3("Vibhu",10,11,"C", 9));
		
		System.out.println("Before Sorting ======= : \n");
		Iterator<Student3> it = ll.iterator();
		while(it.hasNext())
		{
			//Student3 s = (Student3)it.next();
			System.out.println(it.next());
		}
		
            Collections.sort(ll, new MultipleSorting());
            
            System.out.println("\nAFTER SORTING ============  \n");
            Iterator<Student3> itr = ll.iterator();
            while(itr.hasNext())
    		{
    			Student3 s1 = (Student3)itr.next();
    			System.out.println(s1);
    		}
	}

}
