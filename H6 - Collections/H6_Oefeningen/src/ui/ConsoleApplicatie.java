package ui;

import domein.DomeinController_Oef1;

public class ConsoleApplicatie {
	private final DomeinController_Oef1 domeinController;

	public ConsoleApplicatie(DomeinController_Oef1 dc) {
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
