package com.practice4;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


class Student1 
{
	String name;
	int rollno;

	Student1(String name, int rollno) 
	{
		this.name = name;
		this.rollno = rollno;
	}
	
}
class sortroll implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) 
	{
		
		return o1.rollno > o2.rollno? -1 :1;
	}
}
public class ComparatorTreeSet 
{

	public static void main(String[] args) 
	{
		HashSet<Student1> hs = new HashSet<>();
		hs.add(new Student1("Aarav", 101));
		hs.add(new Student1("Zuhi", 111));
		hs.add(new Student1("Prerna", 106));
		hs.add(new Student1("Avinash", 110));
		
		
		LinkedList<Student1> ll = new LinkedList<>(hs);
		
		Collections.sort(ll, new sortroll());
		Iterator<Student1> it = ll.iterator();
		while(it.hasNext())
		{
			Student1 s = (Student1)it.next();
			System.out.println("Name : " +s.name);
			System.out.println("RollNo : " +s.rollno);
		}
	}
}
