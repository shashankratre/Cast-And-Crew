package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filestream1 {

	public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("C:\\Caps\\CAPSPay\\CapsPay_Practice\\input.txt.txt");
	         out = new FileOutputStream("C:\\Caps\\CAPSPay\\CapsPay_Practice\\output.txt.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}