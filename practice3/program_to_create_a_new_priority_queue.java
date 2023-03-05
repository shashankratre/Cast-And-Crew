package com.practice3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class program_to_create_a_new_priority_queue 
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
		Iterator<String> it = s.iterator();
		System.out.println("Priority Queue Elements are : ");
		while(it.hasNext())
		{
         System.out.println(it.next());
		}
	}

}
