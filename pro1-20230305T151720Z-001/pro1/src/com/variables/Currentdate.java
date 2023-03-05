package com.variables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Currentdate 
{

	public static void main(String[] args) 
	{
		Date day = new Date();// Instantiate a Date object
		SimpleDateFormat form = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a ZZZ");
		System.out.println(form.format(day));
	}

}
