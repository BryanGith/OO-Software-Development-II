package domein;

import java.util.List;

import persistentie.BeheersKostenMapper;

public class KostenRepository {

	private List<BeheersKost> kosten;
	private BeheersKostenMapper beheersKostenMapper;

	public KostenRepository() {
		beheersKostenMapper = new BeheersKostenMapper();
		kosten = beheersKostenMapper.geefBeheersKosten();
	}

	public List<BeheersKost> getKosten() {
		return kosten;
	}

	public BeheersKost geefBeheersKost(int index) {
		return kosten.get(index);
	}
}