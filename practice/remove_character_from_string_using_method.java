package com.practice;

public class remove_character_from_string_using_method {
	public static String removecharAt(String s, int pos) 
	{
		return s.substring(0, pos) + s.substring(pos + 1);	
	}
	public static void main(String[] args) 
	{
String s1 = "Fantastic Beasts: The Secrets of DumbleDore";
System.out.println(removecharAt(s1,30));
	}
}

