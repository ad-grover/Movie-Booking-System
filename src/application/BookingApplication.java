package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import constants.SeatTypes;
import constants.ShowTimings;
import entities.Movie;
import entities.User;

public class BookingApplication {

	public static ArrayList<Movie> movieList= new ArrayList<Movie>();
	public static List<User> users=new ArrayList<User>();
	 

	public void bookMovie(User user, Movie movie, Date date, String slot) {

	}

	public static void main(String[] args) {

		Movie movie1 = new Movie("ABCD");
		Movie movie2 = new Movie("EFGH");
		Movie movie3 = new Movie("HIJK");
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);



		User user1 = new User("Aditya", 25);
		User user2 = new User("Vikas", 24);
		users.add(user1);
		users.add(user2);

		Scanner input=new Scanner(System.in);
		System.out.println("SELECT AMONG THE SHOW TIMIMGS, ENTER THE FIRST LETTER");
		System.out.println(Arrays.asList(ShowTimings.values()));



		String show=input.nextLine();

		switch (show) {
		case "M":
			break;
		case "A":
			break;
		case "E":
			break;
		default:
			System.out.println("You seem to have entered an invalid choice, Please input again");
			break;
		}

		System.out.println("SELECT AMONG THE SHOW CLASS");
		System.out.println(Arrays.asList(SeatTypes.values()));
		String showClass=input.nextLine();

		switch (showClass) {
		case "S":
			break;
		case "G":
			break;
		case "D":
			break;
		default:
			System.out.println("Invalid show type");
			break;
		}

		System.out.println("SELECT THE SEAT NUMBER ACCORDING TO THE SEAT CLASS");
		String seatNumber=input.nextLine();
		
		

	}

}
