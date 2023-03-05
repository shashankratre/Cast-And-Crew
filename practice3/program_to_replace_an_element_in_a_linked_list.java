package com.practice3;

import java.util.LinkedList;

public class program_to_replace_an_element_in_a_linked_list 
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
		
		System.out.println("Given LinkedList : \n"+s);
		
		s.set(5, "KASHMIR_AND GOA");
		
		System.out.println("\nUpdated LinkedList : \n"+s);
	}

}
