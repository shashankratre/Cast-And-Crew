package com.practice3;

import java.util.HashMap;
import java.util.Scanner;

public class program_to_check_whether_a_map_contains_key_value_mappings_or_not 
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key(Integer) Elements to Search : ");
		int x = sc.nextInt(); 
		if(!ed.isEmpty())
		{
		if(ed.containsKey(x) )
		{
			
			System.out.println("MAPPING FOUND !!! : " + ed.get(x));
		}
		else
		{
			System.out.println("MAPPING NOT FOUND !!!");
		}
		}
		else
		{
			System.out.println("EMPTY MAPPING !!");
		}
		sc.close();
		

	}

}
