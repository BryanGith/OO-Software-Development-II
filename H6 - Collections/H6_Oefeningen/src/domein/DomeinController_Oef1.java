package domein;

import java.util.Collection;

public class DomeinController_Oef1 {
	private final Garage garage;
	private final OnderhoudRepository onderhoudRepository;

	public DomeinController_Oef1() {
		onderhoudRepository = new OnderhoudRepository();
		garage = new Garage(onderhoudRepository.geefAlle());

	}

	public String geefAutosVoorOnderhoud() {
		String result = "";
		Collection<Auto> autos = garage.geefAutosVoorOnderhoud();
		if (autos != null)
			for (Auto auto : autos) {
				result += String.format("%s%n", auto);
			}
		return result;
	}

	public String geefOnderhoudsLijst() {
		String result = "";
		Collection<Onderhoud> onderhouden = garage.getOnderhoudLijst();
		if (onderhouden != null)
			for (Onderhoud onderhoud : onderhouden) {
				result += String.format("%s%n", onderhoud);
			}
		return result;
	}

	public void schoonOnderhoudLijstOp() {
		garage.voegAangrenzendeOnderhoudenSamen();
	}

	public void sorteerOnderhoudLijst() {
		garage.sorteerOnderhoudLijst();
	}

}
