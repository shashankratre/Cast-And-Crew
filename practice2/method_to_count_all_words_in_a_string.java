package com.practice2;

import java.util.Scanner;
public class method_to_count_all_words_in_a_string 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string ");
String s = sc.nextLine();
System.out.println("No of Words in string : "+countwords(s));
sc.close();
	}
	public static int countwords(String s)
	{
		int count =0;
		 if (!(" ".equals(s.substring(0, 1))) && !(" ".equals(s.substring(s.length() - 1))))	
     	{
		for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                count++;
            } 
        } 
		count = count +1 ;
	}
		 return count;
     }

}
