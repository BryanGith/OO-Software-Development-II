package domein;

public class Ticket implements Kosten {
	private String omschrijving;
	private double prijs;

	public Ticket(String omschrijving, double prijs) {
		super();
		this.omschrijving = omschrijving;
		this.prijs = prijs;
	}

	@Override
	public String toString() {
		return String.format("%20s%10.2f", omschrijving, prijs);
	}

	@Override
	public double berekenPrijs() {
		return prijs;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		if (prijs < 0) {
			throw new IllegalArgumentException();
		}
		this.prijs = prijs;
	}

}
