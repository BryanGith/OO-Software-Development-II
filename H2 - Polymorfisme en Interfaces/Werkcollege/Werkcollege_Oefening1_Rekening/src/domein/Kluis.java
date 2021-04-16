package domein;

public class Kluis implements BeheersKost {
	private int kluisnummer;
	private String houder;
	private static double JAARLIJKSE_KOST = 29;

	public Kluis(int kluisnummer, String houder) {
		super();
		this.kluisnummer = kluisnummer;
		this.houder = houder;
	}

	@Override
	public double geefJaarlijkseKost() {
		return JAARLIJKSE_KOST;
	}

	@Override
	public String toString() {
		return String.format("Detail: Kluisnr = %d, Houder = %s%nKost: %.1f", kluisnummer, houder,
				geefJaarlijkseKost());
	}

	private int getKluisnummer() {
		return kluisnummer;
	}

	private void setKluisnummer(int kluisnummer) {
		this.kluisnummer = kluisnummer;
	}

	private String getHouder() {
		return houder;
	}

	private void setHouder(String houder) {
		this.houder = houder;
	}

}
