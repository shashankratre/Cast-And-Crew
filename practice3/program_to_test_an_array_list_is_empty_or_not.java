package com.practice3;

import java.util.ArrayList;
public class program_to_test_an_array_list_is_empty_or_not 
{
	public static void main(String[] args) 
	{
		ArrayList<String> s = new ArrayList<String>();
	
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		System.out.println("Is array list is empty !! "+ s.isEmpty());
		s.removeAll(s);
		System.out.println("Is array list is empty !! "+ s.isEmpty());
	
	}
}
