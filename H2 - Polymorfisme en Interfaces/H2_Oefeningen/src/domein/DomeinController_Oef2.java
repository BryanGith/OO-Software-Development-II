package domein;

public class DomeinController_Oef2 {
	private final DraagbaarRepository draagbaarRepository;

	public DomeinController_Oef2() {
		draagbaarRepository = new DraagbaarRepository();
	}

	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		Draagbaar wapen = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
		draagbaarRepository.voegDraagbaarItemToe(wapen);
	}

	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		Draagbaar sleutel = new Sleutel(naam, gewicht, niveau, deur);
		draagbaarRepository.voegDraagbaarItemToe(sleutel);
	}

	public String toonOverzicht() {
		return draagbaarRepository.toonOverzicht();
	}
	
	public void voegGebouwToe(String naam, double hoogte) {
		Draagbaar gebouw = new Gebouw(naam, hoogte);
		draagbaarRepository.voegDraagbaarItemToe(gebouw);
	}
	
	

}
