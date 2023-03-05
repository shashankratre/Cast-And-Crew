package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.ClubEmployee_DaoImplemented;
import com.spring.jdbc.tableclass.ClubEmployee;

public class MainMethod {

	public static void main(String[] args) 
	{
		System.out.println("SPRING JDBC STARTED");
      ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc_config.xml");
      
      ClubEmployee_DaoImplemented CEDI = ac.getBean("daoimplemented", ClubEmployee_DaoImplemented.class);
      //now we are calling bean of ClubEmployee_DaoImplemented that is daoimplemented 
      ClubEmployee clubemployee1 = new ClubEmployee();
      
 // -------INSERTING VALUES INTO TABLE -------------
//      clubemployee1.setFIRST_NAME("Shivam");
//      clubemployee1.setLAST_NAME("Ray");
//      clubemployee1.setAGE(26);
//      int result = CEDI.insert(clubemployee1);
//      System.out.println("RECORD INSERTED "+result);
      
 //---------  UPDATING VALUES OF TABLE ------------   
//      clubemployee1.setEMPID(2);
//      clubemployee1.setFIRST_NAME("Abhishek");
//      clubemployee1.setLAST_NAME("Jain");
//      clubemployee1.setAGE(40);
//      int result = CEDI.update(clubemployee1);
//      System.out.println("RECORD UPDATED "+result);
      
//----------DELETE ROW FROM TABLE------------------ 
     
//      clubemployee1.setFIRST_NAME("Abhishek");
//      int result = CEDI.delete(clubemployee1);
//      System.out.println("RECORD DELETED "+result);
      
//---SELECT SINGLE OBJECT USING SPRING JDBC WITH ROWMAPPER----------------
//      ClubEmployee c1 = CEDI.getEmployeeDetails(5);
//      System.out.println(c1);
      
//---SELECT MULTIPLE OBJECT USING SPRING JDBC WITH ROWMAPPER----------------      
      List<ClubEmployee> tabeldetails = CEDI.getAllEmployeeDetails();
      for(ClubEmployee ce : tabeldetails)
      {
    	  System.out.println(ce);
      }
     
	}

}
