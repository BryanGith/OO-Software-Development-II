package ui;

import domein.Movie;

public class EqualsApp {

	public EqualsApp() {
		Movie firstMovie = new Movie("Force Awakens", 8.3, 2016);
		Movie secondMovie = new Movie("Force Awakens", 8.3, 2016);

		System.out.println("Are the movies equal? ");

		System.out.println(firstMovie.equals(secondMovie) ? "yes" : "no");

	}
}
