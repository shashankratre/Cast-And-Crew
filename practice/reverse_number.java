package com.practice;

public class reverse_number 
{

	public static void main(String[] args) 
	{
		int x = 985462314;
		int reverse =0;
		System.out.println("ENTERED  NUMBER IS "+x );
		//Logic for reversing a number
		for(int i =0;i<9;i++) // run for loop upto number of digits we need to reverse the number like 3 ,4 ,5,6,7 etc.
		{
		 int digit = x %10;
		 reverse = reverse*10+digit; // multiply reverse*10 so that output will be in same line
		 x/=10;
//System.out.println(reverse ); //if we use this print statement then the output will be in pyramid form ,hence we can also make pyramid of any number
		}
		System.out.println("REVERSED NUMBER IS "+reverse );
	}

}
