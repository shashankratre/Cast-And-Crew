package com.practice3;

import java.util.LinkedList;
import java.util.List;

public class program_to_insert_elements_into_the_linked_list_at_the_first_and_last_position 
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
		System.out.println("Given LinkedList : "+ s);
		s.add(0, "INDIA");
		s.add(s.size(), "AMERICA");

		System.out.println("Updated LinkedList : "+ s);

	}

}
