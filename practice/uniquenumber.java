package com.practice;

import java.util.Scanner;
//unique number using for loop
public class uniquenumber
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;
		int count =0;
		for(int i =0;i<6;i++)
		{
			int d = x%10;
			x = x/10;
			int n =x;
			if(n%10==d)
			{
			count =1;
			break;
			}
			n = x/10;
		}
		if(count == 0)
		{
			System.out.println(y + " is unique number");
		}
		else
		{
			System.out.println(y +" is not unique");
		}
		sc.close();

	}

}
