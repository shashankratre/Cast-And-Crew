package com.practice;

public class fibonacci_series_using_while_loop 
{
	public static void main(String[] args) 
	{
	int fsttrm = 0;
	int sectrm = 1;
	int n =10;
	int x =0; //Initialize x value to zero so that we can run our loop for (x<n) in while block
	int sum =0;
	System.out.println("Fibonacci Series till " +n+ " terms");
	do
	{
		    sum =sum + fsttrm;
		    System.out.println(fsttrm);
		   // System.out.println("SUM = "+ sum); // to check each sum value
	        int nxttrm = fsttrm + sectrm;
			fsttrm = sectrm;
			sectrm = nxttrm;
			x++;	//increment x value in do block so that our "while" statement got terminate 
	   //     n--;   // or we can decrement n value to terminate while loop.
	}
	while(x<n);
	System.out.println("SUM = "+ sum);
	}
}
