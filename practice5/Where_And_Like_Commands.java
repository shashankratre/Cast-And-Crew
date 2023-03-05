package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Where_And_Like_Commands extends Database_Credentials
{

	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection(serverurl, id, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT FIRST_NAME, AGE FROM STUDENT_REGISTRATION WHERE FIRST_NAME LIKE '%ra%'");
		while(rs.next())
		{
			System.out.println("NAME : "+ rs.getString("FIRST_NAME") +" AGE : "+ rs.getInt("AGE"));
		}
		rs.close();
		st.close();
		con.close();

	}

}
