
package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Movie_Oef3;

public class ComparatorApp_Oef3 {

	public ComparatorApp_Oef3() {
		List<Movie_Oef3> list = new ArrayList<>();
		list.add(new Movie_Oef3("Force Awakens", 8.3, 2015));
		list.add(new Movie_Oef3("Star Wars", 8.7, 1977));
		list.add(new Movie_Oef3("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie_Oef3("Return of the Jedi", 8.4, 1983));

		// Sorteer Movie objecten op 'rating' :
		// (1) Maak een object via een Lambda expressie met een methode referentie
		// (2) Roep Collections.sort aan en geef dit
		// object mee als tweede parameter
		// (3) Print de gesorteerde lijst

		// (1)
		// Comparator<Movie_Oef3> comparator = Movie_Oef3::compareRating;
		Comparator<Movie_Oef3> comparator = Comparator.comparing(Movie_Oef3::getRating).reversed();

		// (2)
		Collections.sort(list, comparator);
		System.out.println("Sorted by rating via Lambda expression");

		// (3)
		for (Movie_Oef3 movie : list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		}

		// Sorteer Movie objecten op 'name' :
		// (1) Maak een object via een Lambda expressie met een methode referentie
		// (2) Roep Collections.sort aan en geef dit
		// object mee als tweede parameter
		// (3) Print de gesorteerde lijst

		// (1)
		// Comparator<Movie_Oef3> comparator2 = Movie_Oef3::compareName;
		Comparator<Movie_Oef3> comparator2 = Comparator.comparing(Movie_Oef3::getName).reversed();

		// (2)
		Collections.sort(list, comparator2);
		System.out.println("\nSorted by name via Lambda expression");

		// (3)
		for (Movie_Oef3 movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}

}
