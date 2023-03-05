package com.practice;

public class comparision_of_string_using_method 
{
	// COMPARISION OF STRING
		public static void main(String[] args) 
		{
		  String s1 ="How Are You?";
		  String s2 ="how are yo?";
		  String s3 ="How Are You?";
		  String s4 ="How Are Y?";
		  String s5 ="Egg Is Good For Health";
		
		 
		  System.out.println(s1.compareTo(s2));
		  System.out.println(s1.compareTo(s3));
		  System.out.println(s1.compareTo(s4));
		  System.out.println(s1.compareTo(s5));
		  System.out.println("COMPARE TO IGNORE CASE");
		  System.out.println(s1.compareToIgnoreCase(s2));
		  System.out.println(s1.compareToIgnoreCase(s3));
		  System.out.println(s1.compareToIgnoreCase(s4));
		  
		// compareTo() = a value less than 0 if the given string is lexicographically less than the string argument;
		//   Returns the value 0 if string1 is equal to string3; 
		  //and a value greater than 0 if the given string is lexicographically greater than the string argument
		  // lexicographically means dictionary order
	 
		  
		//  compareToIgnoreCase() = a negative integer, zero, or a positive integer
		  // as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
		}

	}
