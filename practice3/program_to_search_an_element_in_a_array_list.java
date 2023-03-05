package com.practice3;

import java.util.ArrayList;

public class program_to_search_an_element_in_a_array_list 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("mumbai");
		s.add("delhi");
		s.add("hyderabad");
		s.add("goa");
		s.add("banglore");
		s.add("jalandhar");
		s.add("chandigarh");
		s.add("raipur");
		s.add("patna");	
		
		boolean b = s.contains("raipur");
		System.out.println("Searched Elements - "+b);
	}
}
