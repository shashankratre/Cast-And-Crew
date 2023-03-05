package com.practice5;

public class Database_Credentials
{
	static final	String serverurl = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\\" ;
	static final String id= "capspaytraining" ;
	static final String pass= "CastandCrew@98";

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		
	}

}
