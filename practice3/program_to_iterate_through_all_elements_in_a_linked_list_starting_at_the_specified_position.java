package com.practice3;

import java.util.LinkedList;
import java.util.List;

public class program_to_iterate_through_all_elements_in_a_linked_list_starting_at_the_specified_position 
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
		System.out.println("Iterate Elements at Specified Position in LinkedList : \n");
		for(int i =2;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
	}
}
