package com.practice3;

import java.util.ArrayList;
import java.util.List;

public class program_to_compare_two_array_lists 
{

	public static void main(String[] args) 
	{
		List<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		s.add("tesla");
		s.add("renault");
		s.add("hundai");
		s.add("THE100");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		
		List<String> names = new  ArrayList<>();
		names.add("KGF");
		names.add("BAHUBALI");
		names.add("PUSHPA");
		names.add("JANNAT");
		names.add("VIKRAM");
		names.add("THE100");
		names.add("LAST SHIP");
		names.add("HARRY POTTER");
		
		List<String> s1 = new  ArrayList<>();
		for(String s2 : s)
		{
			s1.add(names.contains(s2)?"YES" : "NO");
		}
		System.out.println(s1);
	}

}
