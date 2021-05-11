package ui;

import java.util.List;

import domein.DomeinController;

public class VoorbeeldApplicatie {
	private final DomeinController dc;

	public VoorbeeldApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		afdrukkenLijst("\nDe Daltons als lijst:", dc.geefOverzicht());

		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op naam:", dc.geefOverzichtGesorteerdOpNaam());
		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op aflopende grootte:",
				dc.geefOverzichtGesorteerdOpAflopendeGrootte());

		afdrukkenLijst("\nDe Daltons zonder dubbels:", dc.haalDubbelsEruit());

		dc.voegExtraStripfigurenToe();

		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op naam:", dc.geefOverzichtGesorteerdOpNaam());

		afdrukkenLijst("\nDrie willekeurige Dalton-figuren:", dc.pick3());

	}

	private void afdrukkenLijst(String message, List<String> lijst) {
		System.out.println(message);
		lijst.forEach(System.out::println);
	}
}
