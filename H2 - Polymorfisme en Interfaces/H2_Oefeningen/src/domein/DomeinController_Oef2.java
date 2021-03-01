package domein;

public class DomeinController_Oef2 {
	private final VoorwerpRepository voorwerpRepo;

	public DomeinController_Oef2() {
		voorwerpRepo = new VoorwerpRepository();
	}

	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		Voorwerp wapen = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
		voorwerpRepo.voegVoorwerpToe(wapen);
	}

	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		Voorwerp sleutel = new Sleutel(naam, gewicht, niveau, deur);
		voorwerpRepo.voegVoorwerpToe(sleutel);
	}

	public String toonOverzicht() {
		return voorwerpRepo.geefOverzicht();
	}

}
