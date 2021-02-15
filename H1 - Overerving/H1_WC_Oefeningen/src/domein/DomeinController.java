package domein;

import java.util.List;

public class DomeinController {
	private final RekeningRepository rr;

	public DomeinController() {
		rr = new RekeningRepository();
	}

	public String geefRekeningen() {
		// zet lijst van Rekeningen om in een String
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r/* .toString() */);
		return uitvoer;
	}

	public String geefCodes() {
		// maak een String met de codes van alle Rekeningen uit de lijst
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r.geefCode());
		return uitvoer;
	}

}
