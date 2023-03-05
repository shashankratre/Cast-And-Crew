package com.practice2;

public class find_common_elements_btwn_two_string_arrays 
{
	//find the common elements between two arrays (string values).
		public static void main(String[] args) 
		{
			 String[] ar1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL","PostgreSQL"};
		     String[] ar2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
		     for(int i =0;i<ar1.length;i++)
		     {
		    	 for(int j =0;j<ar2.length;j++)
		    	 {
		    		 if(ar1[i]==ar2[j])
		    		 {
		    			 System.out.println("\nCommon Element Present at index "+ i + " word is " +ar1[i]);
		    		 }
		    	 }
		     }
		}

	}