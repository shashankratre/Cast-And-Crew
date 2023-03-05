package com.practice3;

import java.util.HashMap;
import java.util.Scanner;

public class program_to_test_if_a_map_contains_a_mapping_for_the_specified_value 
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
		System.out.println("Enter Value (String) : ");
		String s = sc.nextLine();
		if(ed.containsValue(s))
		{
			System.out.println("Value Present in the Map !! " );
		}
		else
		{
			System.out.println("NO Such Value Present !! ");
		}
		sc.close();

	}

}
