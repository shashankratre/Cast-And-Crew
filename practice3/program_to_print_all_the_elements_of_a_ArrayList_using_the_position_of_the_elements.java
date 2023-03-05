package com.practice3;

import java.util.ArrayList;
import java.util.List;

public class program_to_print_all_the_elements_of_a_ArrayList_using_the_position_of_the_elements 
{

	public static void main(String[] args) 
	{
		List<String>s1 = new ArrayList<String>();
		s1.add("Rohan");
		s1.add("Ram");
	    s1.add("Shayam");
		s1.add("Srikanth");
		s1.add("vikram");
		s1.add("Warner");
		for (int i =0;i<s1.size();i++)
		{
			System.out.println(s1.get(i));
		}
	}
}
