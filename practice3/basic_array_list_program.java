package com.practice3;

import java.util.ArrayList;
import java.util.Iterator;

public class basic_array_list_program 
{

	public static void main(String[] args) 
	{
ArrayList<String> name = new ArrayList<>();
name.add("Raman");
name.add("modi");
name.add("shivam");
name.add("bahubali");
name.add("kgf");
System.out.println("Name : \t\n" +name);
System.out.println("\nAccessed Name : "+name.get(2));
System.out.println("\nRemoved Name : "+name.remove("modi"));
System.out.println("\nUpdated Name : \t\n" +name);
Iterator<String> it = name.iterator();
while(it.hasNext())
{
	System.out.println("\n"+it.next());
}

	}

}
