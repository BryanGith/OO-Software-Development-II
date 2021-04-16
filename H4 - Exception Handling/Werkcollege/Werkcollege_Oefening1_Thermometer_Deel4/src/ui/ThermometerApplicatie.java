package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Thermometer;

public class ThermometerApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Thermometer thermometer = new Thermometer();
		String aantalGraden;
		boolean herhaal = true;

		do {
			try {
				System.out.print("Geef een temperatuur (eenheid Fahrenheit) in het interval [14, 104]: ");
				aantalGraden = input.next();

				thermometer.stelAantalGradenIn(aantalGraden);
				System.out.printf("De temperatuur is %d°C", thermometer.converteerNaarCelcius());
				herhaal = false;

			} catch (NumberFormatException nfe) {
				System.err.println("Foutieve invoer! Moet numeriek zijn!");
				input.nextLine();
			} catch (IllegalArgumentException iae) {
				System.err.println(iae.getMessage());
			}
		} while (herhaal);

	}

}
