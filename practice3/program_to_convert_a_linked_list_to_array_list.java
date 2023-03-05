package com.practice3;

import java.util.ArrayList;
import java.util.LinkedList;

public class program_to_convert_a_linked_list_to_array_list 
{

	public static void main(String[] args) 
	{
		LinkedList<String> s = new LinkedList<>();
		s.add("AMRITSAR");
		s.add("HYDERAABAD");
		s.add("BMW");
		s.add("AUDI");
		s.add("HUNDAI");
		s.add("HONDA");
		s.add("BMW");
		s.add("ZEBRONICS");
		s.add("ZARA");
		s.add("BOAT");
		s.add("JBL");
		
		ArrayList<String> s1 = new ArrayList<>(s);
		System.out.println("ArrayList Is : \n");
		for(String s2 : s1)
		{
			System.out.println(s2);
		}

	}

}
