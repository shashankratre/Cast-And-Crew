package com.practice3;

import java.util.Collections;
import java.util.LinkedList;

public class program_to_shuffle_the_elements_in_a_linked_list 
{

	public static void main(String[] args) 
	{
		LinkedList<String> s = new LinkedList<>();
		s.add("AMRITSAR");
		s.add("HYDERAABAD");
		s.add("BMW");
		s.add("AUDI");
		s.add("HUNDAI");
		s.add("HONDA");
		s.add("BMW");
		s.add("ZEBRONICS");
		s.add("ZARA");
		s.add("BOAT");
		s.add("JBL");
		System.out.println("Before Shuffling Elements In LinkedList : \n"  +s);
		Collections.shuffle(s);
		System.out.println("\nAfter Shuffling Elements In LinkedList : \n"  +s);

	}

}
