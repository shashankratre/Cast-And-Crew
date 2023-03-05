package com.springcore.javabased.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration 
{
	
public Engine enginedetails()
{
	return new Engine();
}
@Bean
public Car cardetails()
{
	return new Car(enginedetails());
}
}
