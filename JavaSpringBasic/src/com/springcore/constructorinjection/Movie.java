package com.springcore.constructorinjection;

public class Movie 
{
	private String moviename;
	private float budget ;
	private MovieDetails details;
	//here we are not using getters and setters instead we are passing arguments through constructor
	public Movie(String moviename, float budget,MovieDetails details)
	{
		this.moviename=moviename;
		this.budget=budget;
		this.details=details;
	}

	@Override
	public String toString() {
		return "Movie Name : " + moviename + ",\nBudget : " + budget + ",\nMovie Details : \n" + details;
	}

}
