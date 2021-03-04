package domein;

public class Thermometer_Deel2 {

	private int aantalGraden;
	private static final int ONDERGRENS = 14;
	private static final int BOVENGRENS = 104;
	private static final int NULWAARDE = 32;

	public Thermometer_Deel2() {
		this(NULWAARDE);
	}

	public Thermometer_Deel2(int aantalGraden) {
		setAantalGraden(aantalGraden);
	}

	public int getAantalGraden() {
		return aantalGraden;
	}

	private void setAantalGraden(int aantalGraden) {
		if (aantalGraden < ONDERGRENS || aantalGraden > BOVENGRENS) {
			throw new IllegalArgumentException(
					String.format("De temperatuur moet tot het interval [%d, %d] behoren", ONDERGRENS, BOVENGRENS));
		}
		this.aantalGraden = aantalGraden;
	}

	public int converteerNaarCelcius() {
		// return (int) (5.0 / 9 * (aantalGraden - 32));
		return (aantalGraden - NULWAARDE) * 5 / 9;

	}

}
