package com.practice2;

import java.util.Scanner;

public class program_to_print_diagonal_pattern {
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number : ");
	    int n = sc.nextInt();
	    int i, j;
	    
	    //Write your code here
	      for(i=1;i<=n;i++)
		    {
		        for(j=1;j<=n;j++)
		        {
		           if((i==0||i+j==n+1)||(i==j))
		            {
		            System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		       System.out.println("\t");
		    }   

	}


}
