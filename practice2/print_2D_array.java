package com.practice2;

public class print_2D_array 
{
	//printing of 2d array
	public static void main(String[] args) 
	{
        String[][] s = {{"Virat","Rohit","Surya"},{"Priya","Hema","Pooja"}}; // 2d array of 2 row and 3 column
        for(int i =0;i<s.length;i++)
        {
       	 for(int j =0;j<s[i].length;j++)
       	 {
       		 System.out.print(s[i][j]+"\t");
            }
            System.out.println("\n");
        }
	}
}
