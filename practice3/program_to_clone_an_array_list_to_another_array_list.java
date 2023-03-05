package com.practice3;

import java.util.ArrayList;
import java.util.List;
public class program_to_clone_an_array_list_to_another_array_list
{
	public static void main(String[] args) 
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("BMW");
		s.add("audi");
		s.add("LAST SHIP");
		s.add("HARRY POTTER");
		System.out.println("ARRAY LIST  : "+s);
		List<String> s1 = (ArrayList<String>)s.clone();
		System.out.println("Cloned Array List : "+s1);
	}
}
