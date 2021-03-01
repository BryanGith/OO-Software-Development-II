package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

//tag::codeExample[]
public class DivideByZeroNoExceptionHandling {

	public static int berekenQuotient(int teller, int noemer) {
		return teller / noemer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean opnieuw = true;

		do {
			try {
				System.out.print("Geef een integere waarde voor de teller: ");
				int teller = scanner.nextInt();
				System.out.print("Geef een integere waarde voor de noemer: ");
				int noemer = scanner.nextInt();

				int quotient = berekenQuotient(teller, noemer);
				System.out.printf("%nResultaat: %d / %d = %d%n", teller, noemer, quotient);
				opnieuw = false;
			} catch (ArithmeticException e) {
				System.err.print(e);
				System.out.println("Noemer mag niet 0 zijn!");
			} catch (InputMismatchException e) {
				scanner.nextLine(); // invoerbuffer leegmaken
				System.err.print(e);
				System.out.println("Invoer moet uit een geheel getal bestaan");
			}
		} while (opnieuw);

		scanner.close();
	}

}
//end::codeExample[]
