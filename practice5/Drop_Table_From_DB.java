package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Drop_Table_From_DB 
{
	static final String serverurl = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\\" ;
	static final String id= "capspaytraining" ;
	static final String pass= "CastandCrew@98";

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection cc = DriverManager.getConnection(serverurl, id, pass);
			Statement st = cc.createStatement();
			String droptable = "DROP TABLE NEW_STUDENT_REGISTRATION";
			
			st.executeUpdate(droptable);
			System.out.println("TABLE DELETED");
			
			cc.close();
			st.close();
			
		}
catch(Exception e)
		{
	e.printStackTrace();
		}
	}

}
