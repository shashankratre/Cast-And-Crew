package com.practice3;

import java.util.LinkedList;

public class program_to_display_the_elements_and_their_positions_in_a_linked_list 
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
		System.out.printf("%15s %15s ","Name" ,"Number");
		for(int i =0; i<s.size();i++)
		{
			System.out.printf("\n");
			System.out.printf("%15s %15s ", s.get(i), i);
			
		}
	}

}
