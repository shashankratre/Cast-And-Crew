package com.practice;

import java.util.Formatter;

public class formatting_int_array_using_formatter_class 
{

	public static void main(String[] args) 
	{
		int num[] = {20, 21, 22, 23, 24, 25, 26, 27, 28,29,30};  
		Formatter fmt = new Formatter();  
		fmt.format("%15s %15s %15s\n", "Number", "Square", "Cube");  
		for (int i=0;i<num.length;i++)   
		{  
		fmt.format("%14d %14d %17d\n", num[i], (num[i]*num[i]), (num[i]*num[i]*num[i]));  
		}  
		System.out.println(fmt);  
	}

}
