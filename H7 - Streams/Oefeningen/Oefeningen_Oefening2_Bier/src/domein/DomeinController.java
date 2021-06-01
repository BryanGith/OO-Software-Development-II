package domein;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DomeinController {

	private final BierWinkel bierWinkel;

	public DomeinController() {
		bierWinkel = new BierWinkel();
	}

	public long geefAantalBierenMetMinAlcoholPercentage(double percentage) {
		return bierWinkel.geefAantalBierenMetMinAlcoholPercentage(percentage);
	}

	public List<String> geefLijstAlleBierenMetMinAlcoholPercentage(double percentage) {
		return bierWinkel.geefAlleBierenMetMinAlcoholPercentage(percentage).stream().map(Bier::toString)
				.collect(Collectors.toList());
	}

	public String geefNamenBieren() {
		return bierWinkel.geefNamenBieren().stream().collect(Collectors.joining(String.format("%n")));
	}

	public List<String> geefAlleBieren() {
		return null;
	}

	public String geefBierMetHoogsteAlcoholPercentage() {
		Bier bier = bierWinkel.geefBierMetHoogsteAlcoholPercentage();
		return bier == null ? "Geen" : bier.toString();
	}

	public String geefBierMetLaagsteAlcoholPercentage() {
		Bier bier = bierWinkel.geefBierMetLaagsteAlcoholPercentage();
		return bier == null ? "Geen" : bier.toString();
	}

	public List<String> sorteerOpAlcoholGehalteEnNaam() {
		return bierWinkel.sorteerOpAlcoholGehalteEnNaam().stream().map(Bier::toString).collect(Collectors.toList());
	}

	public String geefAlleNamenBrouwerijen() {
		return bierWinkel.geefAlleNamenBrouwerijen().stream().collect(Collectors.joining(String.format("%n")));
	}

	public String geefAlleNamenBrouwerijenMetWoord(String woord) {
		return bierWinkel.geefAlleNamenBrouwerijenMetWoord(woord).stream()
				.collect(Collectors.joining(String.format("%n")));
	}

}
