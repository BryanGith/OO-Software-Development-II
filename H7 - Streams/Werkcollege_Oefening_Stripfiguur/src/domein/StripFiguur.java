package domein;

import java.util.Objects;

public class StripFiguur 
{
	private final String naam;
	private double grootte;//in m 1,75
	
	public StripFiguur(String naam, double grootte) {
		controleerNaam(naam);
		this.naam = naam;
		setGrootte(grootte);
	}

	public String getNaam() {
		return naam;
	}

	private void controleerNaam(String naam) {
		if(naam == null || naam.isBlank())
			throw new IllegalArgumentException("Geen correcte naam");
	}

	public double getGrootte() {
		return grootte;
	}

	public final void setGrootte(double grootte) {
		if(grootte <= 0)
			throw new IllegalArgumentException("Grootte kan niet kleiner dan 0 of 0 zijn.");
		this.grootte = grootte;
	}

	@Override
	public String toString() {
		return String.format("%s is %d cm groot", naam ,(int)(grootte*100));
	}

	@Override
	public int hashCode() {
		return Objects.hash(grootte, naam);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StripFiguur other = (StripFiguur) obj;
		return Double.doubleToLongBits(grootte) == Double.doubleToLongBits(other.grootte)
				&& Objects.equals(naam, other.naam);
	}
}
