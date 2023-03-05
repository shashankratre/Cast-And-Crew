
package com.practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.FileReader;
import java.io.FileWriter;
public class filestreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
		String fileName = "C:\\\\Caps\\\\CAPSPay\\\\CapsPay_Practice\\\\input.txt";
	      FileInputStream in;
	      FileInputStream out;
	      File ifl = new File("C:\\Caps\\CAPSPay\\CapsPay_Practice\\input.txt");
	      File ofl = new File("C:\\Caps\\CAPSPay\\CapsPay_Practice\\output.txt");
		try {
			System.out.println(ifl.getAbsolutePath());
			in = new FileInputStream(fileName);
			out = new FileInputStream(ofl);

			System.out.println(in.hashCode());
		      //in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      

	      /*
	       * 	      FileOutputStream out = null;
	      

	      
	      System.out.println(new File("input.txt").getAbsolutePath());
	       * try {
	         in = new FileInputStream("C:/Caps/CAPSPay/CapsPay_Practice/input.txt");
	         out = new FileOutputStream("output.txt");
	         
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
	      }*/
	   }

}

