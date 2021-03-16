package domein;

import java.util.ArrayList;
import java.util.List;

public class BestellingRepository {

	private List<Bestelling> bestellingen;

	public BestellingRepository() {
		bestellingen = new ArrayList<>();
	}

	public void voegToe(Bestelling bestelling) {
		bestellingen.add(bestelling);
	}

	public List<Bestelling> getBestellingen() {
		return bestellingen;
	}

}
