package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Thermometer_Deel4;

public class ThermometerApplicatie_Deel4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String gradenF;
		Thermometer_Deel4 t;
		boolean herhaal = true;

		t = new Thermometer_Deel4();
		do {
			try {
				System.out.print("Geef een temperatuur in graden F (geheel getal uit [14,104]: ");
				gradenF = input.nextLine();

				t.stelAantalGradenIn(gradenF);

				System.out.printf("%d graden F komt overeen met %d graden C%n", t.getAantalGraden(),
						t.converteerNaarCelcius());
				herhaal = false;
				input.close();
			} catch (NumberFormatException e) {
				System.err.println("Invoer moet een geheel getal zijn");
			} catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
		} while (herhaal);
	}

}
