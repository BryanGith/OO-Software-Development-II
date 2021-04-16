package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.DomeinController;

public class DraagbaarApplicatie {
	private final DomeinController dc;

	public DraagbaarApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		int keuze;

		do {
			keuze = geefKeuzeUitMenu();

			switch (keuze) {
			case 1:
				voegWapenToe();
				break;
			case 2:
				voegSleutelToe();
				break;
			case 3:
				voegGebouwToe();
				break;
			case 4:
				System.out.printf("%s", dc.geefOverzicht());
				break;
			}
		} while (keuze != 5);

	}

	private int geefKeuzeUitMenu() {
		String uitvoer = "Kies uit:%n";
		uitvoer += String.format("%s%n", "1. Voeg wapen toe");
		uitvoer += String.format("%s%n", "2. Voeg sleutel toe");
		uitvoer += String.format("%s%n", "3. Voeg gebouw toe");
		uitvoer += String.format("%s%n", "4. Toon huidig overzicht");
		uitvoer += String.format("%s%n", "5. Beeindig deze applicatie");

		int keuze = -1;
		Scanner input = new Scanner(System.in);
		boolean flag = true;

		do {
			try {
				System.out.printf(uitvoer);
				System.out.print("Je keuze is: ");
				keuze = input.nextInt();
				if (keuze < 0 || keuze > 5) {
					throw new IllegalArgumentException("De keuze moet in het interval [1,5] liggen. Probeer opnieuw.");
				}
				flag = false;
			} catch (InputMismatchException ex) {
				System.err.println("Voer een geheel getal in.");
				input.nextLine();
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		} while (flag);

		return keuze;
	}

	private void voegWapenToe() {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do {
			try {
				System.out.print("Geef een naam (zonder spaties): ");
				String naam = input.next();
				System.out.print("Geef het gewicht: ");
				double gewicht = input.nextDouble();
				System.out.println("Geef het niveau: ");
				int niveau = input.nextInt();
				System.out.println("Geef de kracht: ");
				int kracht = input.nextInt();
				System.out.println("Werd het wapen reeds gebruikt (true/false)?");
				boolean gebruikt = input.nextBoolean();
				dc.voegWapenToe(naam, gewicht, niveau, kracht, gebruikt);
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("Geef alle gegevens voor het wapen correct in." + " Probeer opnieuw.");
				input.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (flag);

	}

	private void voegSleutelToe() {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do {
			try {
				System.out.print("Geef een naam (zonder spaties): ");
				String naam = input.next();
				System.out.print("Geef het gewicht: ");
				double gewicht = input.nextDouble();
				System.out.println("Geef het niveau: ");
				int niveau = input.nextInt();
				System.out.println("Geef het nummer van de deur: ");
				int deur = input.nextInt();
				dc.voegSleutelToe(naam, gewicht, niveau, deur);
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("Geef alle gegevens voor de sleutel correct in. Probeer opnieuw.");
				input.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (flag);
	}

	private void voegGebouwToe() {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do {
			try {
				System.out.print("Geef een naam (zonder spaties): ");
				String naam = input.next();
				System.out.print("Geef de hoogte: ");
				double hoogte = input.nextDouble();
				dc.voegGebouwToe(naam, hoogte);
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("Geef alle gegevens voor het gebouw correct in. Probeer opnieuw.");
				input.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (flag);
	}
}
