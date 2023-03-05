package com.variables;

import java.util.regex.Pattern;

public class RegexCharacterClass 
{

	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("[abc]", "aef"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "defg"));
		System.out.println(Pattern.matches("[abc]", "ebc"));
		System.out.println(Pattern.matches("[abc]", "c"));
		System.out.println(Pattern.matches("[abc]", "bc"));
		System.out.println(Pattern.matches("[abc]", "b"));
		System.out.println(Pattern.matches("[abc]", "ab"));

	}

}
