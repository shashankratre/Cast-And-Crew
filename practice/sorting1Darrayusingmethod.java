package com.practice;

import java.util.Arrays;

public class sorting1Darrayusingmethod
{

	public static void main(String[] args) 
	{
      int[] x = {45,56,78,69,36,976,75,100,112,156,356};
      Arrays.sort(x); // Sorting using method, here we need to import Array class
      for (int i =0;i<x.length;i++)
      {
    	  System.out.println(x[i]);
      }
	}
}
