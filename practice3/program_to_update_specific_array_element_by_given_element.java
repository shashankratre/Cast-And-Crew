package com.practice3;

import java.util.ArrayList;

public class program_to_update_specific_array_element_by_given_element
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
System.out.println("Given Array List - "+s);
s.set(2, "koondapur");
System.out.println("Updat Array List - "+ s);
	}
}
