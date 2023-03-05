package com.variables;

public class UnderstandingMethodOverloading 
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
	//METHOD OVERLOADING
	//When a class has two or more methods by the same name"MAXNUMBER"  but different parameters"INT" and "DOUBLE", it is known as method overloading. 
	public static double  maxnumber(double u,double v)//defining METHOD with arguments and return type
	{
		 double max; 
		if(u>v)
		{
			max = u;
		}
		else
		{
			max =v;
		}
		return max;
	}
	public static void main(String[] args) 
	{
		
		int a =100;
		int b=50;
		double c=99.69;
		double d = 78.56;
		//int c =maxnumber(a,b); //it is not necessary to assign a method to a variable to call the method.
		System.out.println("Maximum INTEGER number is : " +maxnumber(a,b)); //we can directly call the method by calling it with variable. 
		System.out.println("Maximum DOUBLE number is : " +maxnumber(c,d));   //Also noted that this method is only called if in the method definition "STATIC" keyword is used
	}
	


}
