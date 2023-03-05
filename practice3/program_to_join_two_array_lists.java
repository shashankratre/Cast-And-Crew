package com.practice3;

import java.util.ArrayList;
import java.util.List;

public class program_to_join_two_array_lists 
{

	public static void main(String[] args) 
	{
		List<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		System.out.println("ARRAY LIST 1 : "+s);
		List<String>s1 = new ArrayList<String>();
		s1.add("Rohan");
		s1.add("Ram");
	    s1.add("Shayam");
		s1.add("Srikanth");
		s1.add("vikram");
		s1.add("Warner");
		System.out.println("ARRAY LIST 2 : "+s1);
		s.addAll(s1);
		System.out.println("Joined ARRAY LIST 1 AND 2 : "+s);

	}

}
