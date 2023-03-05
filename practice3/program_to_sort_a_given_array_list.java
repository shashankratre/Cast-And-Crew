package com.practice3;

import java.util.ArrayList;

public class program_to_sort_a_given_array_list 
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
		s.add("america");
		
		s.sort(null);
		System.out.println("Sorted Array List - \n");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
		}
		
	}
