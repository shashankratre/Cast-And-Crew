package com.practice3;

import java.util.PriorityQueue;

public class program_to_convert_a_priority_queue_to_an_array 
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
		System.out.println("Before Conversion : "+s);
		s.toArray();
		System.out.println("Converted into Array : "+s);

	}

}
