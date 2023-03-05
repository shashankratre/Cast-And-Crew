package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledate {

	public static void main(String[] args) 
	{
		Date d = new Date();
		SimpleDateFormat form = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(form.format(d));
	}

}
