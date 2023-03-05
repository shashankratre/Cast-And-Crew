package com.practice3;

import java.util.LinkedList;


public class program_to_insert_the_specified_element_at_the_front_of_a_linked_list 
{

	public static void main(String[] args) 
	{
		LinkedList<String> s = new LinkedList<>();
		s.add("BMW");
		s.add("AUDI");
		s.add("HUNDAI");
		s.add("HONDA");
		//
		s.offerFirst("pakistan2");
		//OfferFirst method returns the element at first position although if we add elements at zero index
		s.add(0, "pakistan");
		//
		s.add("ZEBRONICS");
		s.add("ZARA");
		s.add("BOAT");
		s.add("JBL");
		s.offerFirst("pakistan2");
		
		
		System.out.println("Implementation of OfferFirst Method : "+s);

	}

}
