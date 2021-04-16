package cui;

import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.MijnGetal;
import exceptions.NegativeNumberException;

public class ConsoleApplicatie {

	public ConsoleApplicatie() {
		Scanner input = new Scanner(System.in);
		String invoer, uitvoer;
		String[] delen;
		MijnGetal mg;
		int getal;
		boolean opnieuw;

		do {
			uitvoer = "";
			opnieuw = false;
			System.out.print("Geef 2 positieve gehele getallen, gescheiden door een spatie: ");
			invoer = input.nextLine();
			delen = invoer.trim().split(" ");
			try {
				if (delen.length != 2) {
					throw new NoSuchElementException(
							"Er moeten precies 2 getallen ingevoerd worden gescheiden door precies 1 spatie");
				}
				for (String deel : delen) {

					getal = Integer.parseInt(deel);
					mg = new MijnGetal(getal);
					uitvoer += String.format("De vierkantswortel van %d is %d%n", mg.getGetal(),
							mg.geefVierkantswortel());

				}
				System.out.println(uitvoer);
			} catch (NoSuchElementException | NegativeNumberException e) {
				System.out.println(e.getMessage());
				opnieuw = true;
			} catch (NumberFormatException e) {
				System.out.println("De invoer moet uit gehele getallen bestaan!");
				opnieuw = true;
			}
		} while (opnieuw);
	}

}
