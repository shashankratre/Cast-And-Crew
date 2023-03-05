package com.practice;

public class fibonacci_series_using_for_loop
{

	public static void main(String[] args) 
	{
		int fsttrm =0;
		int sectrm =1;
		int n = 10;
		int SUM =0; // for sum of fibonacci series logic
		System.out.println("Fibonacci Series till " +n+ " terms");
		for(int i =0;i<n;i++)
		{
			// sum of fibonacci series logic 
			SUM = SUM +fsttrm;  
			
			// logic of fibonacci series printing
	       System.out.println(fsttrm);
	       int nxttrm = fsttrm + sectrm;
			fsttrm = sectrm;
			sectrm = nxttrm;
			
		}
		System.out.println("SUM OF FIBONACCI SERIES "+ SUM);// TO GIVE SUM OF FIBONACCI SERIES
	
	}
}
