package com.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program_to_reverse_elements_in_a_array_list 
{

	public static void main(String[] args)
	{
		List<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("tesla");
		s.add("renault");
		s.add("hundai");
		
		System.out.println("Before Reversing : "+s);
		
		Collections.reverse(s);
		System.out.println("After Reversing : "+s);

	}
}
