package com.practice3;

import java.util.ArrayList;

public class program_to_insert_an_element_into_the_array_list_at_the_first_position {

	public static void main(String[] args) 
	{
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("Rohan");
		elements.add("Ram");
		elements.add("Shayam");
		elements.add("Srikanth");
		elements.add("vikram");
		elements.add("Warner");
	
		System.out.println("Original Array List = "+elements);
		elements.add(0, "VAMSI");
		System.out.println("New Array List = "+elements);
	}
}
