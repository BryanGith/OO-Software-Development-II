package domein;

import java.util.Collection;

import persistentie.OnderhoudMapper;

public class OnderhoudRepository {

	private final OnderhoudMapper onderhoudMapper;

	public OnderhoudRepository() {
		this.onderhoudMapper = new OnderhoudMapper();
	}

	public Collection<Onderhoud> geefAlle() {
		return onderhoudMapper.geefOnderhoudVanAutos();
	}
}
