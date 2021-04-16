package cui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.DomeinController;
import exceptions.TeGroteBestellingException;

public class BestellingApplicatie {

	private DomeinController dc;

	public BestellingApplicatie(DomeinController dc) {
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
				for (String bestelling : dc.geefBestellingen()) {
					System.out.println(bestelling);
				}
				break;

			}
		} while (keuze != 3);
	}

	private int geefKeuzeUitMenu() {

		String uitvoer = "Kies uit:%n";
		uitvoer += String.format("%s%n", "1. Nieuwe bestelling");
		uitvoer += String.format("%s%n", "2. Overzicht bestellingen");
		uitvoer += String.format("%s%n", "3. Beëindig deze applicatie");

		int keuze = -1;
		Scanner input = new Scanner(System.in);
		boolean flag = true;

		do {
			try {
				System.out.printf(uitvoer);
				System.out.print("Je keuze is: ");
				keuze = input.nextInt();
				if (keuze < 0 || keuze > 3) {
					throw new IllegalArgumentException("De keuze moet in het interval [1,3] liggen, probeer opnieuw.");
				}
				flag = false;
			} catch (InputMismatchException ex) {
				System.out.println("Voer een geheel getal in.");
				input.nextLine();
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		} while (flag);

		return keuze;
	}

	private void maakNieuweBestelling() {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Geef het aantal printers: ");
			int printers = input.nextInt();
			System.out.print("Geef het aantal laptops: ");
			int laptops = input.nextInt();
			System.out.print("Geef het aantal scanners: ");
			int scanners = input.nextInt();

			dc.voegBestellingToe(printers, laptops, scanners);

		} catch (InputMismatchException ex) {
			System.out.println("Voer een geheel getal in.");
			input.nextLine();
		} catch (IllegalArgumentException | TeGroteBestellingException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception e) {
			System.out.println("Er is een probleem");
		}

	}
}
