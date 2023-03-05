package com.practice2;

//import java.util.Arrays;

public class reversing_int_array_elements 
{

	// Reversing Array Elements

	public static void main(String[] args) 
	{
		int[] array1 = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
		System.out.println("Reversed Array Elements : \n");
   for(int i = 0; i < array1.length / 2; i++)
  {
    int temp = array1[i];
    array1[i] = array1[array1.length -i- 1];
    array1[array1.length -i - 1] = temp;
    System.out.println("\t"+array1[i]);
  }
   
   //System.out.println("Reverse array : "+Arrays.toString(array1));
 }
}