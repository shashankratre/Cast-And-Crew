package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Database 
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\\\"","capspaytraining","CastandCrew@98");
			Statement s = c.createStatement();
			
			  String sql = "CREATE DATABASE SHASHANK_STUDENT"; 
			  s.executeUpdate(sql);
			 
		System.out.println("DATABASE CREATED");
		c.close();
		s.close();
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
