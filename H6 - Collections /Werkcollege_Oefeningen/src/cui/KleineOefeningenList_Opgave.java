package cui;

import java.util.*;

public class KleineOefeningenList_Opgave {

	private static final String COLORS[] = { "red", "white", "blue" };

	// declareer list en list2 van type List. De collections zullen Strings
	// bijhouden.
	// ------------------------------------------------------------------------------
	private List<String> list, list2;

	public KleineOefeningenList_Opgave() {

		// creëer arrayList list en vul op met { "red", "white", "blue" } (= 1
		// instructie)
		list = new ArrayList<>(Arrays.asList(COLORS)); // dynamische lijst (lengte is wijzigbaar)

		// Voeg "green" op het einde van de arrayList toe
		list.add("green");

		// Voeg "green" toe op index 2
		list.add(2, "green");
		// ----------------------------------------------------
		weergevenLijst("oplossing: red white green blue green", list);
//
		// verwijder het tweede element
		list.remove(1);
		// ---------------------------
		weergevenLijst("oplossing: red green blue green", list);

		// verwijder de string "green"
		list.remove("green");
		// ---------------------------------
		weergevenLijst("oplossing: red blue green", list);

		// Geef het tweede element weer op het scherm d.m.v. printf
		System.out.printf("Het tweede element is %s%n", list.get(1));
		// --------------------------------------------------------
		// Komt "blue" voor in de arrayList
		// -----------------------------------------------
		System.out.println("oplossing: blue komt voor");

		if (list.contains("blue"))
			System.out.println("           blue komt voor\n");
		else
			System.out.println("           blue komt niet voor\n");

		// wijzig het derde element naar de string "yellow"
		list.set(2, "yellow");
		// ------------------------------------------------
		weergevenLijst("oplossing: red blue yellow", list);

		// creëer een tweede lege arrayList (list2)
		list2 = new ArrayList<>();
		// -------------------------------------------

		// alle elementen van list kopiëren naar een tweede arrayList list2 (= 1
		// instructie)
		list2.addAll(list);
		// ---------------------------------------------------------------------------------

		// is list = list2 ?
		// ------------------
		System.out.println("Oplossing : idem");

		if (list.equals(list2))
			System.out.println("            idem\n");
		else
			System.out.println("            niet idem\n");

		naarHoofdletterOmzetten(list);
		weergevenLijst("oplossing: alle elementen van list in hoofdletters", list);

		naarKleineLettersOmzetten(list);
		weergevenLijst("oplossing: alle elementen van list in kleine letters", list);

	} // end constructor

	public void weergevenLijst(String oplossing, List<String> list) {
		// Geef alle elementen van de list weer (laat een spatie tussen elk element).
		// Gebruik printf*/
		// --------------------------------------------------------------------------
		System.out.printf("%s%n%s", oplossing, "           ");
		for (String element : list) {
			System.out.printf("%s ", element);
		}

		System.out.println("\n");

	}

	public void naarHoofdletterOmzetten(List<String> list) {
		// Alle strings van list worden omgezet naar hoofdletters
		// -------------------------------------------------------------
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			listIterator.set(listIterator.next().toUpperCase());

		}

	}

	public void naarKleineLettersOmzetten(List<String> list) {
		//// De strings van list worden omgezet naar kleine letters en worden
		// als nieuwe List<String> teruggegeven.
		// -------------------------------------------------------------
		list.replaceAll(kleur -> kleur.toLowerCase());

	}

	public static void main(String args[]) {
		new KleineOefeningenList_Opgave();
	}

} // end class KleineOefeningenList_Opgave