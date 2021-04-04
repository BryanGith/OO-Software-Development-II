package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import persistentie.StripFiguurMapper;

public class Repository {
	private final List<StripFiguur> lijstStripFiguren;
	private final StripFiguurMapper mapper;

	public Repository() {
		this.mapper = new StripFiguurMapper();
		lijstStripFiguren = new ArrayList<>(Arrays.asList(mapper.geefStripfiguren()));
	}

	public List<StripFiguur> getLijstStripFiguren() {
		return lijstStripFiguren;
	}

	public List<StripFiguur> getLijstStripFigurenGesorteerdOpNaam() {
		Comparator<StripFiguur> comparator = (s1, s2) -> s1.getNaam().compareTo(s2.getNaam());
		Collections.sort(lijstStripFiguren, comparator);

		return lijstStripFiguren;
	}

	public List<StripFiguur> getLijstStripFigurenGesorteerdOpAflopendeGrootte() {
		Comparator<StripFiguur> comparator = (s1, s2) -> Double.compare(s1.getGrootte(), s2.getGrootte()) * -1;
		Collections.sort(lijstStripFiguren, comparator);

		return lijstStripFiguren;
	}

	public Set<StripFiguur> haalDubbelsEruit() {
		Set<StripFiguur> set = new HashSet<>(lijstStripFiguren);
		return set;
	}

	public List<StripFiguur> pick3() {
		Random random = new Random();
		List<StripFiguur> randomStripFiguur = new ArrayList<>(3);

		for (int i = 0; i < randomStripFiguur.size(); i++) {
			StripFiguur randomSF = lijstStripFiguren.get(random.nextInt(lijstStripFiguren.size()));
			randomStripFiguur.add(randomSF);
		}

		return randomStripFiguur;
	}

	public void voegStripFiguurToe(String naam, double grootte) {
		lijstStripFiguren.add(new StripFiguur(naam, grootte));
	}

	public void voegExtraStripfigurenToe() {
		List<StripFiguur> extraFiguurs;
		extraFiguurs = Arrays.asList(mapper.geefExtraStripfiguren());
		lijstStripFiguren.addAll(extraFiguurs);
	}

}
