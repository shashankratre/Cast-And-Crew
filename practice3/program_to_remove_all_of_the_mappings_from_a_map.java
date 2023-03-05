package com.practice3;

import java.util.HashMap;

public class program_to_remove_all_of_the_mappings_from_a_map 
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
		System.out.println("Map Before Removing All the Mapping : "+ed.entrySet());

		ed.clear();
		System.out.println("\nMap After Removing All the Mapping : "+ed.entrySet());

	}

}
