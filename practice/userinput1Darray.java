package com.practice;

import java.util.Scanner;
//1 D User Input Array

public class userinput1Darray 
{
	public static void main(String[] args) 
	{   
		int a;
		int i;
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter no of elements you want - ");
			a=sc.nextInt();
			int[] x = new int[10]; 
			System.out.println("Enter array elements : ");
			for(i=0;i<a;i++)
			{
				x[i]=sc.nextInt();
			}
			
			System.out.println("Entered array elements are : ");	
			for(i=0;i<a;i++)
			{
				System.out.println(x[i]);	
			}
			sc.close();
		
	}
}
