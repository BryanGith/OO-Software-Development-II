package domein;

public class Thermometer_Deel1 {

	private int aantalGraden;

	public Thermometer_Deel1() {
		this(32);
	}

	public Thermometer_Deel1(int aantalGraden) {
		setAantalGraden(aantalGraden);
	}

	public int getAantalGraden() {
		return aantalGraden;
	}

	private void setAantalGraden(int aantalGraden) {
		this.aantalGraden = aantalGraden;
	}

	public int converteerNaarCelcius() {
		// return (int) (5.0 / 9 * (aantalGraden - 32));
		return (aantalGraden - 32) * 5 / 9;

	}

}
