package com.practice3;

import java.util.HashMap;

public class program_to_get_a_shallow_copy_of_a_HashMap_instance 
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
		
		System.out.println("Original HashMap ed : "+ed.entrySet());
		
		HashMap<Integer, String> ed1 =  (HashMap<Integer, String>)ed.clone();
		
		System.out.println("Cloned HashMap ed1 : "+ed1.entrySet());
		

	}

}
