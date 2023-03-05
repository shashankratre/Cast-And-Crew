package com.practice4;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

class Employee 
{
	String name ;
	int empid;
	double salary;
	Employee(String s, int i, double j)
	{
		name=s;
		empid=i;
		salary=j;
	}
	public String  toString()
	{
		
		System.out.printf("%15s %15s %15s ", name, empid, salary);
		return "";
	}
}
//create 2nd class while using comparator
class EmployeeSorting implements Comparator<Map.Entry<Integer,Employee>>
{

	@Override
	public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
		//return (o1.getValue().salary > o2.getValue().salary ) ? -1:1; // Sorting based on salary
		//return o1.getValue().name.compareToIgnoreCase(o2.getValue().name); // sorting based on name
		return (o1.getValue().empid > o2.getValue().empid ) ? 1:-1; // sorting based on value
	}
}
public class EmployeeComparator 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Employee> hm = new LinkedHashMap<>();
		
		hm.put(1, new Employee("Sivam",1063,45652));
		hm.put(2, new Employee("Zainab",1035,62963));
		hm.put(3, new Employee("Abhishek",1083,55693));
		hm.put(4, new Employee("Pivam",1005,62458));
		
		LinkedList<Map.Entry<Integer,Employee>> ll = new LinkedList<>(hm.entrySet());
		
		System.out.printf("%15s %20s %10s \n","Name","EmployeeId","Salary" );
	    
		Collections.sort(ll, new EmployeeSorting());
		
		for(Entry<Integer,Employee> entry : ll)
		{
		System.out.println(entry.getValue());
		
		}

	}

}
