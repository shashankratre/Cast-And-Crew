package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	static final	String serverurl = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\\" ;
	static final String id= "capspaytraining" ;
	static final String pass= "CastandCrew@98";

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection c = DriverManager.getConnection(serverurl, id, pass);
			Statement s = c.createStatement();
			
			String sql ="CREATE TABLE ClubEmployee "
					+ "(EMPID Integer not Null IDENTITY(1,1),"
					+ "FIRST_NAME VARCHAR(255),"
					+ "LAST_NAME VARCHAR(255),"
					+ "AGE Integer not Null,"
					+ "PRIMARY KEY(ID))";
			s.executeUpdate(sql);
			System.out.println("TABLE CREATED SUCCESSFULLY");
		}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
