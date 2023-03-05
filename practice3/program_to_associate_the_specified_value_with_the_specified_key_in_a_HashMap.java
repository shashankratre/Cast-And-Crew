package com.practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class program_to_associate_the_specified_value_with_the_specified_key_in_a_HashMap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer , String> ed = new HashMap<>();
		ed.put(1805, "Rohit");
		ed.put(1807, "Aman");
		ed.put(1809, "Rahul");
		ed.put(1811, "Surya");
		ed.put(1813, "Pant");
		ed.put(1815, "Rohit R");
		ed.put(1817, "Aman D");
		ed.put(1819, "Rahul B");
		ed.put(1821, "Surya K");
		ed.put(1823, "Pant K");
		
		System.out.println("EMPID  NAME");
		//Iterate Using for loop through Map.Entry
		for(Map.Entry x : ed.entrySet())
		{
			System.out.println(x.getKey() +" = "+ x.getValue());
		}
		
		//Iterate Using for loop through key/value Entries
		
		/*	for(Entry<Integer, String> listentry : ed.entrySet())
		{
			System.out.println(listentry);
		}
		
		//Iterate Using Iterator Class
		
		Iterator<Integer> it = ed.keySet().iterator();
		while(it.hasNext())
		{
			int x = (int)it.next();
			System.out.println(x +" = "+ed.get(x));
		}
		*/
		
		
	}
}
