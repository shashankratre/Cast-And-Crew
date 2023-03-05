package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Inserting_Data_in_Table
{
	static final String serverurl = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\\" ;
	static final String id= "capspaytraining" ;
	static final String pass= "CastandCrew@98";

	public static void main(String[] args) throws Exception
	{
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection c = DriverManager.getConnection(serverurl, id, pass);
		Statement st = c.createStatement();
		String sqlquery = "INSERT INTO STUDENT_REGISTRATION VALUES(1011,'RAMU','SINGH',15)";
		st.executeUpdate(sqlquery);
		
		sqlquery = "INSERT INTO STUDENT_REGISTRATION VALUES(1012,'John','Killer',14)";
		st.executeUpdate(sqlquery);
		
		String sqlquery3 = "INSERT INTO STUDENT_REGISTRATION VALUES(1013,'Priya','Gupta',13)";
		st.executeUpdate(sqlquery3);
		
		c.close();
		st.close();

	}

}
