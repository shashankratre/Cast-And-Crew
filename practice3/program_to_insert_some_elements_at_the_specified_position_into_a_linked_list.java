package com.practice3;

import java.util.LinkedList;
import java.util.List;

public class program_to_insert_some_elements_at_the_specified_position_into_a_linked_list 
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
System.out.println("Given Linked List is : \n"+s);

		List<String> s1 = new LinkedList<>();
		s1.add("DELHI");
		s1.add("CHANDIGARH");
		s1.add("MUMBAI");
		
		s.addAll(3, s1);
		
		System.out.println("\nElements Added From specified position(Starting From Position 3 ) in LinkedList : \n"+s);

	}

}
