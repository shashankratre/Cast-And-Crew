package com.practice3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class program_to_iterate_a_linked_list_in_reverse_order 
{

	public static void main(String[] args) 
	{
		List<String> s = new LinkedList<>();
		s.add("BMW");
		s.add("AUDI");
		s.add("HUNDAI");
		s.add("HONDA");
		s.add("ZEBRONICS");
		s.add("ZARA");
		s.add("BOAT");
		s.add("JBL");
	    Collections.reverse(s);
	    System.out.println("Reversed Order Of LinkedList : \n");
		for(int i =0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}

	}

}
