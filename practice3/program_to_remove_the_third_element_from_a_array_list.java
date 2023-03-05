package com.practice3;

import java.util.ArrayList;

public class program_to_remove_the_third_element_from_a_array_list 
{

	public static void main(String[] args) 
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("PUNJAB");
		s.add("UTTAR PRADESH");
		s.add("KASHMIR");
		s.add("TAMIL NADU");
		s.add("MIZORAM");
		s.add("NAGALAND");
		s.add("WEST BENGAL");
		s.add("GUJRAT");
		s.add("MAHARASTRA");
		
		s.remove(2);
		System.out.println("Updated Array List - "+s);

	}

}
