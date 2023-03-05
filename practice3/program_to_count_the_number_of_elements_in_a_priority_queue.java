package com.practice3;

import java.util.PriorityQueue;

public class program_to_count_the_number_of_elements_in_a_priority_queue 
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
		int count =0;
		for(int i =0;i<s.size();i++)
		{
			count++;
		}
		System.out.println("Number Of Elements  : "+count);

	}

}
