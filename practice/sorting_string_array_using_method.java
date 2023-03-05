package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class sorting_string_array_using_method 
{

	//SORTING STRING ARRAY USING sort() method
		public static void main(String[] args) 
		{
			String[] sorting = {"silicon", "rubber","steel","aluminium","cooper","brass","plastic","wood"};
			Arrays.sort(sorting);
			System.out.println(Arrays.toString(sorting));
			
			Arrays.sort(sorting,Collections.reverseOrder());
			System.out.println(Arrays.toString(sorting));

		}

	}
