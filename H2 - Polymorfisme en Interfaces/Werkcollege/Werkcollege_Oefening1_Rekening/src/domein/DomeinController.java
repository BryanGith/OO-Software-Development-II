package domein;

import java.util.List;

public class DomeinController {
	private final RekeningRepository rr;
	private final KostenRepository kr;

	public DomeinController() {
		rr = new RekeningRepository();
		kr = new KostenRepository();
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
		for (Rekening rekening : lijst)
			uitvoer += String.format("%s%n", rekening.geefCode());
		return uitvoer;
	}

	public String[] geefTitelsBeheersKosten() {
		String[] titels = new String[kr.getKosten().size()];
		for (int i = 0; i < titels.length; i++) {
			BeheersKost kostopIndex = kr.geefBeheersKost(i);
			if (kostopIndex instanceof Kluis) {
				titels[i] = kostopIndex.toString();
			} else {
				Rekening rekening = (Rekening) kostopIndex;
				titels[i] = String.format("%s, houder = %s", kostopIndex.getClass().getSimpleName().toLowerCase(),
						rekening.getHouder());
			}

		}
		return titels;
	}

	public String geefDetailBeheersKost(int index) {
		return kr.geefBeheersKost(index).toString();
	}

	public double geefBeheersKostWaarde(int index) {
		return kr.geefBeheersKost(index).geefJaarlijkseKost();
	}

}
