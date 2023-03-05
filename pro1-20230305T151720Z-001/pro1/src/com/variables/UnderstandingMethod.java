package com.variables;

public class UnderstandingMethod 
{

	public static int  maxnumber(int x,int y)//defining METHOD with arguments and return type
	{
		 int max; 
		if(x>y)
		{
			max = x;
		}
		else
		{
			max =y;
		}
		return max;
	}
	public static void main(String[] args) 
	{
		
		int a =100;
		int b=50;
		// int c =maxnumber(a,b); //it is not necessary to assign a method to a variable to call the method.
		System.out.println("Maximum number is : " +maxnumber(a,b)); //we can directly call the method by calling it with variable. 
		                                                  //Also noted that this method is only called if in the method definition "STATIC" keyword is used
	}
	


}
