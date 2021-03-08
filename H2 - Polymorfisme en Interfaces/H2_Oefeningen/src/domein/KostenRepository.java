package domein;

import java.util.List;
import persistentie.KostenMapper;

public class KostenRepository {
	private final List<Kosten> lijstje;
	private final KostenMapper km;

	public KostenRepository() {
		km = new KostenMapper();
		lijstje = km.geefKostenLijst();
	}

	public String geefOverzichtAantalDocumenten() {
		int pa = 0, pbt = 0, t = 0;
		for (Kosten k : lijstje) {
			if (k instanceof Ticket)
				t++;
			else if (k instanceof VerplaatsingPerAuto)
				pa++;
			else
				pbt++;
		}
		return String.format("Volgende documenten werden ingediend:%n"
				+ "%d ticket(s), %d verplaatsing(en) per auto en " + "%d verplaatsing(en) per bus/tram.%n%n", t, pa,
				pbt);
	}

	public String geefKostenLijst() {
		double prijs, prijsZonderBtw, totaal = 0;
		String output = String.format("Overzicht gemaakte kosten:%n%n");
		output += String.format("%70s%15s%n", "Kostenpost", "Bedrag");
		for (Kosten k : lijstje) {
			if (k instanceof Ticket) {
				prijs = k.berekenPrijs();
				totaal += prijs;
				output += String.format("%70s%15.2f%n", ((Ticket) k).getOmschrijving(), prijs);
			} else // k is een Verplaatsing
			{
				prijsZonderBtw = k.berekenPrijs() / 1.21;
				totaal += prijsZonderBtw;
				output += String.format("%70s%15.2f%n", k, prijsZonderBtw);
			}
		}
		output += String.format("%n%nTotaal gedeclareerde kosten = %7.2f%n", totaal);
		return output;
	}

}
