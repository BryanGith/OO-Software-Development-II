package main;

import domein.DomeinController;
import ui.BeheersKostenApplicatie;
import ui.RekeningApplicatie;

public class StartUp {

	public static void main(String[] args) {
		new RekeningApplicatie(new DomeinController()).werkMetRekeningen();
		new BeheersKostenApplicatie(new DomeinController()).werkMetKosten();
	}
}
