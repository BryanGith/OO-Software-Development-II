package ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController_Oef1;

public class DraagbaarApplicatie {
	private final DomeinController_Oef1 dc;

	public DraagbaarApplicatie(DomeinController_Oef1 dc) {
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
				System.out.println(dc.geefOverzicht());
				break;
			}
		} while (keuze != 5);

	}

	private int geefKeuzeUitMenu() {
		Scanner input = new Scanner(System.in);
		int keuze = -1;

		List<String> opties = new ArrayList<>();
		opties.add("Voeg wapen toe");
		opties.add("Voeg sleutel toe");
		opties.add("Voeg gebouw toe");
		opties.add("Toon huidig overzicht");
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
		} while (!(keuze > 0 && keuze < 6));
		return keuze;
	}

	private void voegWapenToe() {
		Scanner input = new Scanner(System.in);
		String naam;
		double gewicht;
		int niveau, kracht;
		boolean gebruikt;

		System.out.print("Geef een naam (zonder spaties): ");
		naam = input.next();
		System.out.print("Geef het gewicht: ");
		gewicht = input.nextDouble();
		System.out.println("Geef het niveau: ");
		niveau = input.nextInt();
		System.out.println("Geef de kracht: ");
		kracht = input.nextInt();
		System.out.println("Werd het wapen reeds gebruikt (true/false) ?");
		gebruikt = input.nextBoolean();

		dc.voegWapenToe(naam, gewicht, niveau, kracht, gebruikt);

	}

	private void voegSleutelToe() {
		Scanner input = new Scanner(System.in);
		String naam;
		double gewicht;
		int niveau, deur;

		System.out.print("Geef een naam (zonder spaties): ");
		naam = input.next();
		System.out.print("Geef het gewicht: ");
		gewicht = input.nextDouble();
		System.out.println("Geef het niveau: ");
		niveau = input.nextInt();
		System.out.println("Geef het nummer van de deur: ");
		deur = input.nextInt();

		dc.voegSleutelToe(naam, gewicht, niveau, deur);

	}

	private void voegGebouwToe() {
		Scanner input = new Scanner(System.in);
		String naam;
		double hoogte;

		System.out.print("Geef een naam (zonder spaties): ");
		naam = input.next();
		System.out.print("Geef de hoogte: ");
		hoogte = input.nextDouble();

		dc.voegGebouwToe(naam, hoogte);
	}
}
