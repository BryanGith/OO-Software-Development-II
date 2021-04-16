package domein;

public abstract class Verplaatsing implements Kosten {
	private String van;
	private String naar;
	private double aantalKm;

	public Verplaatsing(String van, String naar, double aantalKm) {
		setVan(van);
		setNaar(naar);
		setAantalKm(aantalKm);
	}

	public final void setVan(String van) {
		if (van == null || van.equals(""))
			throw new IllegalArgumentException("Vertrekplaats moet ingevuld worden!");
		this.van = van;
	}

	public final void setNaar(String naar) {
		if (naar == null || naar.equals(""))
			throw new IllegalArgumentException("Aankomstplaats moet ingevuld worden!");
		this.naar = naar;
	}

	public final void setAantalKm(double aantalKm) {
		if (aantalKm <= 0)
			throw new IllegalArgumentException("Aantal km moet groter dan 0 zijn!");
		this.aantalKm = aantalKm;
	}

	public String getVan() {
		return van;
	}

	public String getNaar() {
		return naar;
	}

	public double getAantalKm() {
		return aantalKm;
	}

	@Override
	public String toString() {
		return String.format("Verplaatsing van %s naar %s", van, naar);
	}
}
