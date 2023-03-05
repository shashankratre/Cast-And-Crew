package com.practice3;

import java.util.PriorityQueue;

public class program_to_add_all_the_elements_of_a_priority_queue_to_another_priority_queue 
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
		
		System.out.println("Given Priority Queue : "+s);
		
		PriorityQueue<String> s1 = new PriorityQueue<>();
s1.addAll(s);
System.out.println("New Priority Queue S1 : "+s1);

	}

}
