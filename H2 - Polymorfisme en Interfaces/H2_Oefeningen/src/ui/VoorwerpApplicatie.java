package ui;

import domein.DomeinController_Oef2;

public class VoorwerpApplicatie {
	private DomeinController_Oef2 dc;

	public VoorwerpApplicatie(DomeinController_Oef2 dc) {
		this.dc = dc;
	}

	public void start() {
		System.out.println("Beginsituatie:");
		System.out.printf("%s%n%n", dc.toonOverzicht());
		dc.voegWapenToe("Colt", 1.5, 3, 6, false);
		dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
		dc.voegWapenToe("Brown", 0.5, 1, 23, true);
		dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);
		System.out.println("Na het toevoegen van enkele wapens en sleutels:");
		System.out.printf("%s", dc.toonOverzicht());
		dc.voegGebouwToe("Frankenstein", 4.5);
		System.out.printf("%s", dc.toonOverzicht());
	}
}
