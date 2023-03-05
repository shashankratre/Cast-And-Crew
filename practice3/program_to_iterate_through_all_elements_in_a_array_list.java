package com.practice3;
import java.util.ArrayList;
public class program_to_iterate_through_all_elements_in_a_array_list 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new  ArrayList<>();
		names.add("KGF");
		names.add("BAHUBALI");
		names.add("PUSHPA");
		names.add("JANNAT");
		names.add("VIKRAM");
		names.add("THE100");
		names.add("LAST SHIP");
		names.add("HARRY POTTER");
for(String input : names)
{
	System.out.println(input);
}
	}
}