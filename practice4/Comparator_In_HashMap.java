package com.practice4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

class Sorting implements Comparator<Map.Entry<Integer, EmployeeDetails>>
{

	@Override
	public int compare(Entry<Integer, EmployeeDetails> o1, Entry<Integer, EmployeeDetails> o2)
	{
		
	//	return o1.getValue().name.compareToIgnoreCase(o2.getValue().name); // sorting based on name
		return (o1.getValue().age>o2.getValue().age)?1:-1; // sorting based on age


	}
	
}
public class Comparator_In_HashMap 
{

	public static void main(String[] args) 
	{
        HashMap<Integer, EmployeeDetails> hm = new HashMap<>();
		
    	hm.put(1, new EmployeeDetails("Sivam",1063,45652,24));
		hm.put(2, new EmployeeDetails("Zainab",1035,62963,26));
		hm.put(3, new EmployeeDetails("Abhishek",1083,55693,30));
		hm.put(4, new EmployeeDetails("Pivam",1005,62458,27));
		
		LinkedList<Map.Entry<Integer,EmployeeDetails>> ll = new LinkedList<>(hm.entrySet());
		
		System.out.printf("%15s %20s %10s %15s \n","Name","EmployeeId","Salary","Age");
	    
		Collections.sort(ll, new Sorting());
		
		for(Entry<Integer,EmployeeDetails> entry : ll)
		{
		System.out.println(entry.getValue());
		
		}


	}

}
