package com.practice2;

import java.util.Scanner;

public class program_to_find_first_non_repeating_character_in_a_string 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String s = sc.nextLine();
		int count =0;
		for( int i=0;i<s.length();i++)
		{
            count =1;
			for(int j =0;j<s.length();j++)
			{
				if(i!=j&&s.charAt(i)== s.charAt(j))
				{
	               count =2;
				   break;
				}
			}
			if(count==1)
			{
			System.out.println("Non Repeated character found !"+s.charAt(i));	
			}
		}
		sc.close();
	}
}
