package com.variables;

import java.io.File;

public class CreatingDirectories 
{

	public static void main(String[] args) 
	{
		 String dirname = "D:\\directories";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      d.mkdirs();

	}

}
