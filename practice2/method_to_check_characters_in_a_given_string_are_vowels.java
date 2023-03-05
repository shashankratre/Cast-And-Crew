package com.practice2;

import java.util.Scanner;

public class method_to_check_characters_in_a_given_string_are_vowels 
{
	public static boolean checkvowels(String s)
	
	{
		String s1 = "aeiou";
		for(int i =0;i<s.length();i++)
		{
		if(s1.indexOf(s.charAt(i))==-1)//if character present at particular index then returns the index else returns -1
                                         // indexOf gives -1 if the index of given character not found
				{
			System.out.println(s1.indexOf(s.charAt(i)));
			return false;
				}
		System.out.println(s1.indexOf(s.charAt(i)));
		}
		
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println("check vowels :  "+checkvowels(s));
sc.close();
	}

}
