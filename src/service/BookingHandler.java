package service;
import java.util.List;

import entities.Movie;

public interface BookingHandler {

	public List<Movie> getMovieList();
	public List<String> getMovieTimings(Movie movie);
	
	public String generateBooking();	
}