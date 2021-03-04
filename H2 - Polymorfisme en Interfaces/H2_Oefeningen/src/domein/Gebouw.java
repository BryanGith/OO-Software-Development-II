package domein;

public class Gebouw implements Draagbaar {

	private String naam;
	private double hoogte;

	public Gebouw(String naam, double hoogte) {
		super();
		this.naam = naam;
		controleerHoogte(hoogte);
	}

	private void controleerNaam(String naam) {

	}

	private void controleerHoogte(double hoogte) {
		if (hoogte < 3) {
			this.hoogte = 3;
		} else {
			this.hoogte = hoogte;
		}
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getHoogte() {
		return hoogte;
	}

	public void setHoogte(double hoogte) {
		this.hoogte = hoogte;
	}

	@Override
	public boolean isDraagbaar() {
		return false;
	}

	@Override
	public String toString() {
		return String.format("residentie %s met hoogte %.2f is %s", naam, hoogte,
				isDraagbaar() ? "draagbaar" : "niet draagbaar");
	}

}
