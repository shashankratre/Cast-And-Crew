package com.practice3;

import java.util.ArrayList;
import java.util.List;

public class program_to_extract_a_portion_of_a_array_list 
{

	public static void main(String[] args) 
	{
		List<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("tesla");
		s.add("renault");
		s.add("hundai");
		
		System.out.println("Before Extracting : "+s);
	
		List<String> s1 = s.subList(1,5 );
		System.out.println("After Extracting : "+s1);
	}
}
