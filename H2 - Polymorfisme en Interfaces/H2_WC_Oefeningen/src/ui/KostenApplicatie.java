package ui;

import java.util.Iterator;

import domein.DomeinController;

public class KostenApplicatie {
	
	private final DomeinController dc;

	public KostenApplicatie(DomeinController dc) {
		this.dc = dc;
	}
	
	public void werkMetKosten() {
		String[] titels = dc.geefTitelsBeheersKosten();
		
		int index = 0;
		for (String titel : titels) {
			System.out.println(titel);
			System.out.printf("Details: %s%n", dc.geefDetailBeheersKost(index));
			System.out.printf("Kost: %s%n%n", dc.geefBeheersKostWaarde(index));
			index++;
		}
	}
}
