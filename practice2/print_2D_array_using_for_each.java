package com.practice2;

public class print_2D_array_using_for_each 
{

	public static void main(String[] args) 
	{ 
        String[][] name = new String[3][3];  // 2D array of 3 row and 3 column
   
        	 name[0][0] = "ravi"; 
        	 name[0][1] = "hardik"; 
        	 name[0][2] = "virat"; 
        	 name[1][0] = "surya"; 
        	 name[1][1] = "shami"; 
        	 name[1][2] = "pushpa";
        	 name[2][0] = "kgf"; 
        	 name[2][1] = "arjun"; 
        	 name[2][2] = "rohit";
         for (String[] s : name) 
         {
        	 for(String s1 : s) 
         { 
        	 System.out.print(s1 + "\t"); 
         }
         System.out.println("\n"); 
         }
	}
}
