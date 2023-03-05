package com.practice2;

import java.util.Scanner;

public class method_to_count_all_vowels_in_string 
{
	static String countvowels(String s)
	{
		int count =0;
		String s1 =" ";
		for(int i =0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				count++;	
			}
		}
		System.out.println("Number of vowels in the String "+ count);	
		return s1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println(countvowels(s));
sc.close();
	}

}
