package domein;

public class Kluis implements BeheersKost {
	private final String houder;
	private final int kluisnummer;
	private final static double JAARLIJKSE_KOST = 29;

	public Kluis(String houder, int kluisnummer) {
		// geen controle op houder en kluisnummer
		this.houder = houder;
		this.kluisnummer = kluisnummer;
	}

	@Override
	public double geefJaarlijkseKost() {
		return JAARLIJKSE_KOST;
	}

	@Override
	public String toString() {
		return String.format("Kluisnummer = %d, houder = %s", kluisnummer, houder);
	}

}
