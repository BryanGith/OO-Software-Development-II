package ui;

import java.util.*;


class CollectionOperaties {

	// methode verwijderOpLetter
	// -------------------------
	public static void verwijderOpLetter(Collection<String> list, char c) {
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.charAt(0) == c) { // eerste letter van dit element is de gevraagde letter
				iterator.remove();
			}
		}

	}

	// methode verwijderSequence
	// -------------------------
	public static void verwijderSequence(List<String> list, String string) {
		Iterator<String> iterator = list.iterator();
		boolean verwijder = false;
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.equals(string)) { // als we het begin of einde van een sequentie ontdekken
				verwijder = !verwijder;
				iterator.remove();
			} else { // als het niet het begin of het einde is van de sequentie
				if (verwijder) { // ben ik dan aan het verwijderen?
					iterator.remove(); // verwijder dan
				}
			}
			
		}

	}
}

public class OefFruit2_opgave {
	public static void main(String args[]) {
		String kist[][] = { { "appel", "peer", "citroen", "kiwi", "perzik" },
				{ "banaan", "mango", "citroen", "kiwi", "zespri", "pruim" },
				{ "peche", "lichi", "kriek", "kers", "papaya" } };

		List<String> list;
		String mand[];

//Voeg de verschillende kisten samen in een ArrayList list.
//--------------------------------------------------------
		list = new ArrayList<>();
		for (String[] eenKist : kist) {
			list.addAll(Arrays.asList(eenKist));
		}

		CollectionOperaties.verwijderOpLetter(list, 'p');
		System.out.println("na verwijder letter ('p') :  " + list + "\n");

		CollectionOperaties.verwijderSequence(list, "kiwi");
		System.out.println("na verwijder sequence (kiwi) : " + list + "\n");

//Plaats het resultaat terug in een array mand en sorteer die oplopend.
//---------------------------------------------------------------------
		mand = list.toArray(new String[0]);
		// OF mand = list.toArray(new String[list.size()]);
		// OF mand = new String[list.size()]; mand = list.toArray(mand);
		
		Arrays.sort(mand);

//Geef de inhoud van de array "mand" terug
//----------------------------------------
		System.out.println(Arrays.toString(mand));
		
	}
}
