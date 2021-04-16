package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Movie;

public class ComparatorApp {

	public ComparatorApp() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		System.out.println("Sorted by rating");

		Collections.sort(list, Movie::compareRating);

		for (Movie movie : list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		}

		System.out.println("\nSorted by name");

		Collections.sort(list, Comparator.comparing(Movie::getName));
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}

}
