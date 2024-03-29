package domein;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import persistentie.StripFiguurMapper;

public class Repository {
	private final List<StripFiguur> lijstStripFiguren;
	private final StripFiguurMapper mapper;

	public Repository() {
		mapper = new StripFiguurMapper();
		lijstStripFiguren = new ArrayList<>(Arrays.asList(mapper.geefStripfiguren()));
	}

	public List<StripFiguur> getLijstStripFiguren() {
		return lijstStripFiguren;
	}

	public List<StripFiguur> getLijstStripFigurenGesorteerdOpNaam() {

		return lijstStripFiguren.stream().sorted(Comparator.comparing(StripFiguur::getNaam))
				.collect(Collectors.toList());
	}

	public List<StripFiguur> getLijstStripFigurenGesorteerdOpAflopendeGrootte() {

		return lijstStripFiguren.stream().sorted(Comparator.comparing(StripFiguur::getGrootte).reversed())
				.collect(Collectors.toList());
	}

	public Set<StripFiguur> haalDubbelsEruit() {
		return new HashSet<StripFiguur>(lijstStripFiguren);
	}

	public List<StripFiguur> pick3() {
//		SecureRandom sRandom = new SecureRandom();
//		List<StripFiguur> result = new ArrayList<>();
//
//		while (result.size() != 3) {
//			int randomIndex = sRandom.nextInt(lijstStripFiguren.size());
//			StripFiguur figuur = lijstStripFiguren.get(randomIndex);
//
//			if (!result.contains(figuur)) {
//				result.add(figuur);
//			}
//
//		}
//		return result;

		Collections.shuffle(lijstStripFiguren);
		return lijstStripFiguren.subList(0, 3);
	}

	public void voegStripFiguurToe(String naam, double grootte) {
		lijstStripFiguren.add(new StripFiguur(naam, grootte));
	}

	public void voegExtraStripfigurenToe() {
		List<StripFiguur> extra = Arrays.asList(mapper.geefExtraStripfiguren());
		lijstStripFiguren.addAll(extra);
	}

}
