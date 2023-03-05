package com.practice2;

import java.util.Scanner;

public class program_to_check_perfect_number 
{// A number is said to be perfect if sum of its all factors (nut excluding that number) is equal to the given number
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x =0;
	    int sum =0;
	    int y = n;
	    //Write your code here
	    for(int i =1;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            x =i;
	            sum = sum +x;
	        }
	    }
	    if(y==sum)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	    
sc.close();
	}
}