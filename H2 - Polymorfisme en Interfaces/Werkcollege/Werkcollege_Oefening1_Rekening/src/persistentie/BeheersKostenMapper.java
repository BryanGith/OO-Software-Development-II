package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.BeheersKost;
import domein.Kluis;
import domein.SpaarRekening;
import domein.ZichtRekening;

public class BeheersKostenMapper {
	public List<BeheersKost> geefBeheersKosten() {
		List<BeheersKost> lijst = new ArrayList<>();

		SpaarRekening s1, s2;
		ZichtRekening z1, z2;
		Kluis k1, k2;

		SpaarRekening.setAangroeiIntrest(2);

		s1 = new SpaarRekening(101L, "Seba");
		z1 = new ZichtRekening(404L, "Sara", -2000);
		k1 = new Kluis(58, "Bruno");
		k2 = new Kluis(59, "Nina");

		s1.stortOp(100);
		z1.stortOp(400);

		lijst.add(z1);
		lijst.add(k2);
		lijst.add(s1);
		lijst.add(k2);

		return lijst;
	}
}
