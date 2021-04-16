package domein;

public class DomeinController {

	private final DraagbaarRepository draagbaarRepo;

	public DomeinController() {
		draagbaarRepo = new DraagbaarRepository();
	}

	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		Wapen wapen = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
		draagbaarRepo.voegDraagbaarItemToe(wapen);
	}

	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		Sleutel sleutel = new Sleutel(naam, gewicht, niveau, deur);
		draagbaarRepo.voegDraagbaarItemToe(sleutel);
	}

	public String geefOverzicht() {
		return draagbaarRepo.geefOverzicht();
	}

	public void voegGebouwToe(String naam, double hoogte) {
		Gebouw gebouw = new Gebouw(naam, hoogte);
		draagbaarRepo.voegDraagbaarItemToe(gebouw);
	}

}
