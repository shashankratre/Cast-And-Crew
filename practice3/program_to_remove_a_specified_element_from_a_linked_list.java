package com.practice3;

import java.util.LinkedList;

public class program_to_remove_a_specified_element_from_a_linked_list 
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
	
	System.out.println("Original LinkedList : \n"+s);
	
	s.removeFirstOccurrence("BMW");
	s.removeLastOccurrence("BMW");
	System.out.println("Updated LinkedList : \n"+s);
	}

}
