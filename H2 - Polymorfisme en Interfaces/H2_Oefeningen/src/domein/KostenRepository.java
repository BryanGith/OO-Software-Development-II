package domein;

import java.util.ArrayList;
import java.util.List;

public class KostenRepository {
	private KostenMapper km;
	private List<Kosten> lijstje;

	public KostenRepository() {
		lijstje = new ArrayList<>();
		km = new KostenMapper();
	}

	public String geefOverzichtAantalDocumenten() {
		String resul = "";
		resul += "Volgende documenten werden ingediend:\n";
		if (getClass().getSimpleName().equals(VerplaatsingPerAuto)) {
			
		}
		
		return resul;

	}

	public String geefKostenLijst() {
		String resul = "";
		for (Kosten kosten : lijstje) {
			if (kosten instanceof Ticket) {
				String omschrijving = kosten.toString().substring(0, 20);
				double prijs = Double.parseDouble(kosten.toString().substring(21, kosten.toString().length()).trim());
				resul += String.format("%70s%15.2f", omschrijving, prijs);
			} else {
				resul += String.format("%70s%15.2f", kosten.toString(), kosten.berekenPrijs());
			}
		}
		return resul;
	}
}
