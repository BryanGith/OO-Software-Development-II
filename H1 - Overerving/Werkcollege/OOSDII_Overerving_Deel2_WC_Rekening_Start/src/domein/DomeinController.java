package domein;

import java.util.List;

public class DomeinController {
	private final RekeningRepository rr;

	public DomeinController() {
		rr = new RekeningRepository();
	}

	public String geefRekeningen() {
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening rekening : lijst)
			uitvoer += String.format("%s%n", rekening);
		return uitvoer;
	}

	public String geefCodes() {
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r.geefCode());
		return uitvoer;
	}

}
