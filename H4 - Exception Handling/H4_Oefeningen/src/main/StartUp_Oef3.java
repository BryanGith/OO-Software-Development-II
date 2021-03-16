package main;

import domein.DomeinController_Oef3;
import ui.BestellingApplicatie;

public class StartUp_Oef3 {

	public static void main(String[] args) {
		DomeinController_Oef3 dc = new DomeinController_Oef3();
		BestellingApplicatie bestellingApplicatie = new BestellingApplicatie(dc);
		bestellingApplicatie.start();

	}

}
