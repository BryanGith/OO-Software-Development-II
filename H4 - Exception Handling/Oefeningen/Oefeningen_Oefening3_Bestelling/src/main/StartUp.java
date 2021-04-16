package main;

import cui.BestellingApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {

		new BestellingApplicatie(new DomeinController()).start();

	}

}
