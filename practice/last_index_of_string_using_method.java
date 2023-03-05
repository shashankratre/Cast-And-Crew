package com.practice;

public class last_index_of_string_using_method 
{

	//LAST INDEX OF A STRING

	public static void main(String[] args) 
	{
     String s = "The series of harry potter is marvelous ! harry";
     int x = s.lastIndexOf("is");
     if(x==-1) // (x== -1) because index start from 0 , if it is not present it will print not found
     {
     System.out.println("Not Found !! ");
     }
     else 
     {
         System.out.println("Last Index of harry is "+ x);

     }
	}

}
