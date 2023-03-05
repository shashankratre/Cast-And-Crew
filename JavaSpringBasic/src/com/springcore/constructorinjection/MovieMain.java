package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieMain {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/movie.xml");
		Movie m1 = (Movie)ac.getBean("MovieList");
		System.out.println(m1);

	}

}
