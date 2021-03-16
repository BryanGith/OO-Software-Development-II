package ui;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domein.Bestelling;
import domein.DomeinController_Oef3;
import exceptions.TeGroteBestellingException;

public class BestellingApplicatie {

	private DomeinController_Oef3 dc;

	public BestellingApplicatie(DomeinController_Oef3 dc) {
		this.dc = dc;
	}

	public void start() {
		int keuze;
		do {
			keuze = geefKeuzeUitMenu();
			switch (keuze) {
			case 1:
				maakNieuweBestelling();
				break;
			case 2:
				dc.geefBestellingen().forEach(s -> System.out.println(s));

				break;

			}
		} while (keuze != 3);
	}

	private int geefKeuzeUitMenu() {
		Scanner input = new Scanner(System.in);
		int keuze = -1;

		List<String> opties = new ArrayList<>();
		opties.add("Nieuwe bestelling");
		opties.add("Overzicht bestellingen");
		opties.add("Beëindig deze applicatie");

		do {
			System.out.println("Kies uit: ");
			for (String string : opties) {
				System.out.printf("%d. %s%n", opties.indexOf(string) + 1, string);
			}
			System.out.print("Je keuze is: ");
			try {
				keuze = input.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Voer een geheel getal in.");
				input.next();
			}
		} while (!(keuze > 0 && keuze < 4));
		return keuze;

	}

	private void maakNieuweBestelling() {
		int printers, laptops, scanners;
		Scanner input = new Scanner(System.in);

		System.out.print("Geef het aantal printers: ");
		printers = input.nextInt();
		System.out.print("Geef het aantal laptops: ");
		laptops = input.nextInt();
		System.out.print("Geef het aantal scanners: ");
		scanners = input.nextInt();

		try {
			dc.voegBestellingToe(printers, laptops, scanners);
		} catch (TeGroteBestellingException tgbe) {
			System.err.println(tgbe.getMessage());
		} catch (IllegalArgumentException iae) {
			System.err.println(iae.getMessage());
		}

	}
}
