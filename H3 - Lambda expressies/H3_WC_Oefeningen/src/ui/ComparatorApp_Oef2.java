
package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Movie;

public class ComparatorApp_Oef2 {

	public ComparatorApp_Oef2() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		// Sorteer Movie objecten op 'rating' :
		// (1) Maak een object via een Lambda expressie
		// (2) Roep Collections.sort aan en geef dit
		// object mee als tweede parameter
		// (3) Print de gesorteerde lijst

		// (1)
		Comparator<Movie> comparator = (o1, o2) -> Double.compare(o1.getRating(), o2.getRating()) * -1;

		// (2)
		Collections.sort(list, comparator);
		System.out.println("Sorted by rating via Lambda expression");

		// (3)
		for (Movie movie : list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		}

		// Sorteer Movie objecten op 'name' :
		// (1) Maak een object via een Lambda expressie
		// (2) Roep Collections.sort aan en geef dit
		// object mee als tweede parameter
		// (3) Print de gesorteerde lijst

		// (1)
		Comparator<Movie> comparator2 = (o1, o2) -> o1.getName().compareTo(o2.getName());

		// (2)
		Collections.sort(list, comparator2);
		System.out.println("\nSorted by name via Lambda expression");

		// (3)
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}

}
