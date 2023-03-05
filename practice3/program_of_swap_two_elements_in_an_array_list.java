package com.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program_of_swap_two_elements_in_an_array_list 
{

	public static void main(String[] args) 
	{
		List<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		
		System.out.println("Before Swapping : "+s );
		
		Collections.swap(s, 0, 3);
		
		System.out.println("After Swapping : "+s );

	}

}
