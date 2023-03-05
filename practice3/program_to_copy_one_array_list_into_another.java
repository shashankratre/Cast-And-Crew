package com.practice3;

import java.util.ArrayList;
import java.util.Collections;

public class program_to_copy_one_array_list_into_another 
{

	public static void main(String[] args) 
	{
		ArrayList<String> destination = new ArrayList<String>();
		destination.add("mumbai");
		destination.add("delhi");
		destination.add("hyderabad");
		destination.add("goa");
		destination.add("banglore");
		destination.add("jalandhar");
		destination.add("chandigarh");
		destination.add("raipur");
		destination.add("patna");	
		destination.add("america");
		
		System.out.println("\nGiven Array List - "+ destination);
		
		ArrayList<String> source = new ArrayList<String>();
		source.add("Rohan");
		source.add("Ram");
		source.add("Shayam");
		source.add("Srikanth");
		source.add("vikram");
		source.add("Warner");
		
		System.out.println("\nSecond Array List = "+source);
		
		Collections.copy(destination, source); //it throws exception if the destination array list is smaller than source array list// arrayindexoutofbound exception
		
		System.out.println("\nGiven Array List - "+destination);
		System.out.println("\nSecond Array List = "+source);
	}

}
