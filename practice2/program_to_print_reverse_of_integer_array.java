package com.practice2;

import java.util.Scanner;

public class program_to_print_reverse_of_integer_array 
{
	public static void main(String[] args) {
	    int[] arr = new int[10];
	    int n, i;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter array size : ");
	    n = sc.nextInt();
	    int tempo =0;
	    System.out.println("Enter array Elements : ");
	    for (i = 0; i < n; i++)
	        arr[i] = sc.nextInt();
	    
	    //Write your code here
	    for(i=0;i<n/2;i++)
	    {
	        tempo = arr[i];
	        arr[i]=arr[n-1-i];
	        arr[n-1-i]=tempo;
	      
	    }
	    System.out.println("Reversed Array is ");
	    for(i=0;i<n;i++)
	    {
	    System.out.println(arr[i]);
	    }
	    
sc.close();
	}
	}

