package main;

import domein.DomeinController;
import ui.KostenApplicatie;
import ui.RekeningApplicatie;

public class StartUp_Oef1 {

	public static void main(String[] args) {
		// new RekeningApplicatie(new DomeinController()).werkMetRekeningen();
		new KostenApplicatie(new DomeinController()).werkMetKosten();
	}
}
