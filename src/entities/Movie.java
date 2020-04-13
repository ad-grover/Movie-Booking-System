package entities;

import java.util.ArrayList;
import java.util.UUID;

public class Movie {

	public String movieName;
	public String movieId; //Auto Generated
	
	
	
	
	public Movie(String movieName){
		this.movieId=UUID.randomUUID().toString();
		this.movieName=movieName;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	
}
