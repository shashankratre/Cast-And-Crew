package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update_the_Table extends Database_Credentials
{

	public static void main(String[] args) throws Exception
	{
		Connection c = DriverManager.getConnection(serverurl, id, pass);
		
		Statement st = c.createStatement();
		
		ResultSet rss = st.executeQuery("SELECT * From STUDENT_REGISTRATION");
		System.out.println("BEFORE UPDATION ");
		while(rss.next())
		{
			System.out.println("ID : " +rss.getInt(1) + " AGE : "+ rss.getInt(4));
		}
		 String sqlquery3 = "UPDATE STUDENT_REGISTRATION "+
		 		"SET AGE = 35 WHERE ID in(1014) ";
		st.executeUpdate(sqlquery3);
		ResultSet rs = st.executeQuery("SELECT * From STUDENT_REGISTRATION");
		System.out.println("AFTER UPDATION ");
		while(rs.next())
		{
			System.out.println("ID : " +rs.getInt(1) + " AGE : "+ rs.getInt(4));
		}
		rs.close();
		c.close();
		st.close();
		
	}

}
