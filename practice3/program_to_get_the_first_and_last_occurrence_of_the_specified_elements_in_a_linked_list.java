package com.practice3;

import java.util.LinkedList;

public class program_to_get_the_first_and_last_occurrence_of_the_specified_elements_in_a_linked_list 
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
		
		System.out.println("First Occurrence of BMW : " +s.indexOf("BMW"));
		
		System.out.println("Last Occurrence of BMW : " +s.lastIndexOf("BMW"));	
	}

}
