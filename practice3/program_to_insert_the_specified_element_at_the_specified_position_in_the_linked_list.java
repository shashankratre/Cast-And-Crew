package com.practice3;

import java.util.LinkedList;
import java.util.List;

public class program_to_insert_the_specified_element_at_the_specified_position_in_the_linked_list 
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
		System.out.println("Given LinkedList : "+s);
		
		s.add(3, "SAMSUNGSONY");
		System.out.println("Updated LinkedList at Position 3 : "+s);


	}

}
