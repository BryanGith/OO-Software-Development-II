package ui;

import domein.DomeinController_Oef2;
import domein.VerplaatsingPerAuto;

public class VerplaatsingApplicatie {
	private DomeinController_Oef2 dc;

	public VerplaatsingApplicatie(DomeinController_Oef2 dc) {
		this.dc = dc;
	}

	public void start() {
		try {
			new VerplaatsingPerAuto("Gent", "Kortrijk", 47.1, 1.649, 0.084);
			String uitvoer = dc.geefOverzichtAantalDocumenten();
			uitvoer += dc.geefKostenLijst();
			System.out.printf(uitvoer);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

}
