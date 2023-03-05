package com.variables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnderstandingREGULAREXPRESSION 
{

	public static void main(String[] args) 
	{
		Pattern pattern = Pattern.compile("aaAAA.");
		Matcher matcher =pattern.matcher("aaAAAc");//matching the pattern of above arguments
		System.out.println("String matches the given REGEX - " + matcher.matches());
				

	}

}
