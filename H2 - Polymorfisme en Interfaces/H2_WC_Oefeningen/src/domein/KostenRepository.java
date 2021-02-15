package domein;

import java.util.List;

import persistentie.BeheersKostenMapper;

public class KostenRepository {

	private List<BeheersKost> kosten;
	private BeheersKostenMapper beheersKostenMapper;

	public KostenRepository() {
		beheersKostenMapper = new BeheersKostenMapper();
		kosten = beheersKostenMapper.geefBeheersKosts;
	}

	public List<BeheersKost> getKosten() {
		return kosten;
	}
}
