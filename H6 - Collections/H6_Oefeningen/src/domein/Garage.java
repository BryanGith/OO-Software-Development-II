package domein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Garage {
	private List<Onderhoud> onderhoudLijst = new ArrayList<>();

	// implementeer:
	// stop alle onderhouden (~parameter) in het attribuut onderhoudLijst
	public Garage(Collection<Onderhoud> onderhouden) {
		for (Onderhoud onderhoud : onderhouden) {
			onderhoudLijst.add(onderhoud);
		}
	}

	// implementeer:
	// retourneer een Collection met alle unieke auto's uit de onderhoudLijst
	// tip: voeg alle auto's uit de onderhoudLijst toe aan een Set om de unieke
	// auto's te hebben
	public Collection<Auto> geefAutosVoorOnderhoud() {
		HashSet<?> hSet = new HashSet<>(onderhoudLijst);
		return (Collection<Auto>) hSet;
	}

	public Collection<Onderhoud> getOnderhoudLijst() {
		return onderhoudLijst;
	}

	// implementeer:
	// sorteer de onderhoudLijst op Auto (natuurlijk ordening op nummerplaat)
	// vervolgens sorteer je voor gelijke auto's op begindatum van het onderhoud
	public void sorteerOnderhoudLijst() {
		Comparator<Auto> comparator = new Comparator<>() {

			@Override
			public int compare(Auto o1, Auto o2) {
				int result;
				return result = o1.getNummerplaat().compareTo(o2.getNummerplaat());
			}
		};

		// Collections.sort(onderhoudLijst, comparator);

	}

	// implementeer:
	// - indien je dit nog niet deed, implementeer dan eerst de methode
	// isAangrenzendMet in de klasse Onderhoud
	// - roep de hulpmethode sorteerOnderhoudLijst aan om de onderhoudLijst
	// eerst te sorteren, en
	// - voeg dan alle aangrenzende onderhouden samen tot 1 onderhoud
	public void voegAangrenzendeOnderhoudenSamen() {
		sorteerOnderhoudLijst();

	}

}
