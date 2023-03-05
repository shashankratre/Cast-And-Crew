package com.springcore.constructorinjection;

import java.util.Date;

public class MovieDetails 
{
	String actorname;
	String actoressname;
	String director;
	String singer;
	Date releasedate;
	public MovieDetails(String actorname, String actoressname, String director, String singer, Date releasedate) 
	{
		super();
		this.actorname = actorname;
		this.actoressname = actoressname;
		this.director = director;
		this.singer = singer;
		this.releasedate = releasedate;
	}
	@Override
	public String toString() {
		return "Actor Name : " + actorname + ",\nActoress Name : " + actoressname + ",\nDirector : " + director
				+ ",\nSinger : " + singer + ",\nRelease Date : " + releasedate;
	}
	
	
}
