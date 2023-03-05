package com.springcore.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/JDBC/jdbcconfig.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      
	      System.out.println("Creating Record" );
	      studentJDBCTemplate.create("Aashi Jain", 12);
	      studentJDBCTemplate.create("Pihu Singh", 11);
	      studentJDBCTemplate.create("Virat Ray", 13);

	      System.out.println("Record Name" );
	      List<Student> students = studentJDBCTemplate.listStudents();
	      
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("Updating the record" );
	      studentJDBCTemplate.update(2, 20);

	      System.out.println("Listing the record" );
	      Student student = studentJDBCTemplate.getStudent(1);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	   }
	}