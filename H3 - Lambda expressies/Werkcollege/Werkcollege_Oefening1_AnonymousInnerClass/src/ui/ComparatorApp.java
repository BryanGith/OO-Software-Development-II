
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

		// Sorteer Movie objecten op 'rating' :
		// (1) Definieer en instantieer een
		// object van het type RatingCompare gebruik makende
		// van een 'anonymous inner class'
		// (2) Roep Collections.sort aan en geef dit
		// object mee als tweede parameter
		// (3) Print de gesorteerde lijst
		System.out.println("Sorted by rating");

		Collections.sort(list, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				if (m1.getRating() < m2.getRating()) {
					return 1;
				}
				if (m1.getRating() > m2.getRating()) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		for (Movie movie : list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		}
	}
}
