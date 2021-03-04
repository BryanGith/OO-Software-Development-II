package domein;

import java.util.ArrayList;
import java.util.List;

public class KostenMapper {
	public List<Kosten> geefKostenLijst() {
		List<Kosten> kostenLijst = new ArrayList<>();

		kostenLijst.add(new VerplaatsingPerBusTram("Voskenslaan Gent", "Veldstraat Gent", 4.2, 1, false, true));
		kostenLijst.add(new Ticket("Parkeerticket Flanders Expo", 5));
		kostenLijst.add(new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.591, 0.0538));
		kostenLijst.add(new Ticket("Toegangsticket beurs", 10));
		kostenLijst.add(new VerplaatsingPerBusTram("Laarne dorp", "Gent Sint-Pieters", 14.6, 34, true, false));
		kostenLijst.add(new VerplaatsingPerAuto("Gent", "Brussel", 53.7, 1.488, 0.0692));
		kostenLijst.add(new VerplaatsingPerAuto("Gent", "Kortrijk", 47.1, 1.649, 0.084)); // foutieve waarde!

		return kostenLijst;
	}
}
