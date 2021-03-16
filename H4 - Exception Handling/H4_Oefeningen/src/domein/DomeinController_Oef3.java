package domein;

import java.util.List;
import java.util.stream.Collectors;

import exceptions.TeGroteBestellingException;

public class DomeinController_Oef3 {
	private BestellingRepository bestellingRepository;

	public DomeinController_Oef3() {
		bestellingRepository = new BestellingRepository();
	}

	public void voegBestellingToe(int printers, int laptops, int scanners) throws TeGroteBestellingException {

		Bestelling bestelling = new Bestelling(printers, laptops, scanners);
		bestellingRepository.voegToe(bestelling);

	}

	public List<String> geefBestellingen() {
		return bestellingRepository.getBestellingen().stream().map(b -> b.toString()).collect(Collectors.toList());
	}

}
