package domein;

public class Thermometer {
	private int aantalGraden;
	private static int ONDERGRENS = 14, BOVENGRENS = 104, NULWAARDE = 32;

	public Thermometer() {
		this(NULWAARDE);
	}

	public Thermometer(int aantalGraden) {

		setAantalGraden(aantalGraden);
	}

	private void setAantalGraden(int aantalGraden) {
		if (aantalGraden < ONDERGRENS || aantalGraden > BOVENGRENS) {
			throw new IllegalArgumentException("De temperatuur ligt niet in het gevraagde interval!");
		}
		this.aantalGraden = aantalGraden;
	}

	public int getAantalGraden() {
		return aantalGraden;
	}

	public int converteerNaarCelcius() {
		return (int) (5.0 / 9 * (aantalGraden - 32));
	}

	public void stelAantalGradenIn(String invoer) {
		int aantalGraden = Integer.parseInt(invoer);
		setAantalGraden(aantalGraden);
	}

}
