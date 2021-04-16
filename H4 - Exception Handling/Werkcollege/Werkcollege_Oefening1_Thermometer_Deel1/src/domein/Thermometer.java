package domein;

public class Thermometer {
	private int aantalGraden;

	public Thermometer() {
		this(32);
	}

	public Thermometer(int aantalGraden) {
		setAantalGraden(aantalGraden);
	}

	private void setAantalGraden(int aantalGraden) {
		this.aantalGraden = aantalGraden;
	}

	public int getAantalGraden() {
		return aantalGraden;
	}

	public int converteerNaarCelcius() {
		return (int) (5.0 / 9 * (aantalGraden - 32));
	}

}
