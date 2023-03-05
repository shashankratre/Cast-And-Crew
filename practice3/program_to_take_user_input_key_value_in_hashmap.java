package com.practice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program_to_take_user_input_key_value_in_hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> ed = new HashMap<>();		
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<3;i++)
		{
		System.out.println("Enter Key (Integer) : ");
		Integer x = sc.nextInt();
		System.out.println("Enter Value (String) : ");
	    String s = sc.next();
	    ed.put(x, s);
		}
		
		System.out.println("\nEntered HashMap Table : ");
		for(Map.Entry<Integer, String> entry : ed.entrySet())
		{
			System.err.println(entry.getKey()+" = "+ entry.getValue());
		}
		sc.close();
	}
}
