package domein;

import exceptions.BuitenBereikException;

public class Thermometer_Deel4 {

	private int aantalGraden;
	private static final int ONDERGRENS = 14;
	private static final int BOVENGRENS = 104;
	private static final int NULWAARDE = 32;

	public Thermometer_Deel4() {
		this(NULWAARDE);
	}

	public Thermometer_Deel4(int aantalGraden) {
		setAantalGraden(aantalGraden);
	}

	public int getAantalGraden() {
		return aantalGraden;
	}

	private void setAantalGraden(int aantalGraden) {
		if (aantalGraden < ONDERGRENS || aantalGraden > BOVENGRENS) {
			throw new BuitenBereikException(
					String.format("De temperatuur moet tot het interval [%d, %d] behoren", ONDERGRENS, BOVENGRENS));
		}
		this.aantalGraden = aantalGraden;
	}

	public int converteerNaarCelcius() {
		// return (int) (5.0 / 9 * (aantalGraden - 32));
		return (aantalGraden - NULWAARDE) * 5 / 9;

	}

	public void stelAantalGradenIn(String invoer) throws NumberFormatException {
		int graden = Integer.parseInt(invoer);
		setAantalGraden(graden);

	}

}
