package cui;

import domein.DomeinController;

public class H10Oef1 {

	public void start() {
		DomeinController dc = new DomeinController();

		dc.voegWapenToe("Colt", 1.5, 3, 6, false);
		dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
		dc.voegWapenToe("Brown", 0.5, 1, 23, true);
		dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);
		System.out.printf("%s", dc.geefOverzicht());
	}
}
