package ui;

import domein.DomeinController;

public class ConsoleApplicatie {
	private final DomeinController domeinController;

	public ConsoleApplicatie(DomeinController dc) {
		domeinController = dc;
	}

	public void run() {
		System.out.printf("Alle unieke auto's voor onderhoud oplopend op nummerplaat:\n%s\n",
				domeinController.geefAutosVoorOnderhoud());
		System.out.printf("Oorspronkelijke onderhoudLijst: \n%s\n", domeinController.geefOnderhoudsLijst());
		domeinController.sorteerOnderhoudLijst();
		System.out.printf("Gesorteerde onderhoudLijst (nummerplaat - begindatum onderhoud): \n%s\n",
				domeinController.geefOnderhoudsLijst());
		domeinController.schoonOnderhoudLijstOp();
		System.out.printf("OnderhoudLijst na samensmelten van aangrenzende onderhouden:\n%s\n",
				domeinController.geefOnderhoudsLijst());
	}

}
