package com.practice3;

import java.util.PriorityQueue;

public class program_to_compare_two_priority_queues
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
		PriorityQueue<String> s1 = new PriorityQueue<>();
		s1.add("PINEAPPLE");
		s1.offer("watermelon");
		s1.add("HUNDAI");
		s1.add("DELHI");
		s1.add("China");
		s1.offer("grapes");
		s1.add("chicken");
		for(String s2 : s)
		{
		System.out.println(s1.contains(s2)?"YES":"NO");
		}

	}

}
