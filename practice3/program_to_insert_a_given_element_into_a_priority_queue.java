package com.practice3;

import java.util.PriorityQueue;

public class program_to_insert_a_given_element_into_a_priority_queue 
{

	public static void main(String[] args) 
	{
PriorityQueue<String> s = new PriorityQueue<>();
		
		s.add("RED");
		s.add("HUNDAI");
		s.add("DELHI");
		s.add("China");
		s.add("VAN");
		s.add("X");
		s.add("Apple");
		
		System.out.println("Given Queue : "+s);
		
		s.add("MANGO");
		System.out.println("New Queue : "+s);
	}

}
