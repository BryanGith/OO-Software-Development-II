package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Thermometer_Deel1;

public class ThermometerApplicatie_Deel1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gradenF;
		Thermometer_Deel1 t;
		boolean herhaal = true;

		do {
			try {
				System.out.print("Geef een temperatuur in graden F (geheel getal uit [14,104]: ");
				gradenF = input.nextInt();

				if (gradenF < 14 || gradenF > 104) {
					throw new IllegalArgumentException("De temperatuur moet tot het interval [14, 104] behoren");
				}
				t = new Thermometer_Deel1(gradenF);

				System.out.printf("%d graden F komt overeen met %d graden C%n", t.getAantalGraden(),
						t.converteerNaarCelcius());
				herhaal = false;
				input.close();
			} catch (InputMismatchException e) {
				System.err.println("Invoer moet een geheel getal zijn");
				input.nextLine();
			} catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
			} 
		} while (herhaal);
	}

}
