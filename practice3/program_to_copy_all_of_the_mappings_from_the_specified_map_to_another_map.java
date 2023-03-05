package com.practice3;

import java.util.HashMap;
import java.util.Map;

public class program_to_copy_all_of_the_mappings_from_the_specified_map_to_another_map 
{

	public static void main(String[] args) 
	{
		//MAP 1
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
		System.out.println("First HashMap : "+ed.entrySet());
		//MAP 2
		HashMap<Integer , String> ed1 = new HashMap<>();
		System.out.println("\nSecond HashMap : "+ed1.entrySet());
        ed1.putAll(ed);
      
      System.out.println("\nCopied Mappings Of Map1(ed) into Map2(ed1) : \n");
      for(Map.Entry x : ed1.entrySet())
      {
    	  System.out.println(x);
      }
	}
}
