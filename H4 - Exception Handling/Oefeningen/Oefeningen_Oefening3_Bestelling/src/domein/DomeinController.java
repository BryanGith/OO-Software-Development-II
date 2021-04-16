package domein;

import java.util.ArrayList;
import java.util.List;

import exceptions.TeGroteBestellingException;

public class DomeinController {

	private final BestellingRepository br;

	public DomeinController() {
		br = new BestellingRepository();
	}

	public void voegBestellingToe(int printers, int laptops, int scanners) throws TeGroteBestellingException {
		Bestelling b = new Bestelling(printers, laptops, scanners);
		br.voegToe(b);
	}

	public List<String> geefBestellingen() {
		List<Bestelling> bestellingen = br.getBestellingen();

		List<String> bestellingenString = new ArrayList<>();

		for (Bestelling bestelling : bestellingen)
			bestellingenString.add(bestelling.toString());

		return bestellingenString;
	}
}
