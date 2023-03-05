package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expression {


	public static void main(String[] args) 
	{
	Pattern pattern = Pattern.compile("XXaaXX");
	Matcher matcher = pattern.matcher("cbaadf");
	System.out.println("REGEX = "+ matcher.matches());
	
	}

}
