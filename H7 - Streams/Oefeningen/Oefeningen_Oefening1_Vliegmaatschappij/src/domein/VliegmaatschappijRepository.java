package domein;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import persistentie.VliegmaatschappijMapper;

public class VliegmaatschappijRepository {
	private final List<Vliegmaatschappij> maatschappijen;
	private final VliegmaatschappijMapper vm;

	public VliegmaatschappijRepository() {
		vm = new VliegmaatschappijMapper();
		maatschappijen = vm.geefLijstVliegmijen();
	}

	public List<Vliegmaatschappij> getMaatschappijen() {
		return maatschappijen;
	}

	public List<Vliegmaatschappij> geefAlleAirlinesMetMinstensAantalPartners(int aantal) {
		return maatschappijen.stream().filter(vmij -> vmij.getPartners().size() >= aantal).collect(Collectors.toList());
	}

	public List<Vliegmaatschappij> geefAirlinesAlfabetischGesorteerd() {
		return maatschappijen.stream().sorted(Comparator.comparing(Vliegmaatschappij::getNaam))
				.collect(Collectors.toList());
	}

	public List<Vliegmaatschappij> geefAirlinesGesorteerdVolgensAantalPartners() {
		return maatschappijen.stream().sorted(Comparator.comparing(vmij -> vmij.getPartners().size()))
				.collect(Collectors.toList());
	}

	public String geefEersteAirlineStartendMet(String woord) {
		return maatschappijen.stream().map(Vliegmaatschappij::getNaam).filter(naam -> naam.startsWith(woord))
				.findFirst().orElse("Geen gevonden!");
	}

	public Vliegmaatschappij geefEenAirlineMetPartner(String partner) {
		return maatschappijen.stream().filter(vmij -> vmij.isPartner(partner)).findAny().orElse(null);
	}

}
