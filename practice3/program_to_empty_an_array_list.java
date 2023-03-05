package com.practice3;

import java.util.ArrayList;

public class program_to_empty_an_array_list 
{

	public static void main(String[] args) 
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		System.out.println("Array List : "+s);
		s.clear();
		System.out.println("Empty array list : "+s);

	}

}
