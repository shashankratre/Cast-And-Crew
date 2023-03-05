package com.practice3;

import java.util.ArrayList;

public class program_to_retrieve_an_element_at_a_specified_index_from_a_given_array_list
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

	System.out.println("7th element "+s.get(6));
	System.out.println("3rd element "+s.get(2));

	}

}
