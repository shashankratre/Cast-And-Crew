package com.practice3;

import java.util.LinkedList;
import java.util.Scanner;

public class program_to_check_if_a_particular_element_exists_in_a_linked_list 
{

	public static void main(String[] args) 
	{
		LinkedList<String> s = new LinkedList<>();
		s.add("AMRITSAR");
		s.add("HYDERAABAD");
		s.add("BMW");
		s.add("AUDI");
		s.add("HUNDAI");
		s.add("HONDA");
		s.add("BMW");
		s.add("ZEBRONICS");
		s.add("ZARA");
		s.add("BOAT");
		s.add("JBL");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element You Want to Search : ");
		String s1 = sc.nextLine();
		
		if(s.contains(s1))
		{
			System.out.println("Element Found !!");
		}
		else
		{
			System.out.println("Element Not Found !! ");
		}
		sc.close();
	}

}
