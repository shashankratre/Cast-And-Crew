package com.practice3;

import java.util.ArrayList;
import java.util.List;

public class program_to_replace_the_second_element_of_a_ArrayList_with_the_specified_element 
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
		System.out.println("Original Array List : "+s1);
		s1.set(2, "prem");
	 	s1.get(2);
	    System.out.println("After replacing 2nd element : " +s1);
	}

}
