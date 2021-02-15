package ui;

import domein.Movie;

public class EqualsApp {

	public EqualsApp() {
		Movie firstMovie = new Movie("Force Awakens", 8.3, 2015);
		Movie secondMovie = new Movie("Force Awakens", 8.3, 2015);

		System.out.println("Are the movies equal? ");

		// print yes or no
		System.out.println(firstMovie.equals(secondMovie) ? "yes" : "no");

		// hashcode is geen foolproof methode
//		System.out.println(firstMovie.hashCode() == secondMovie.hashCode() ? "yes" : "no");
	}
}
