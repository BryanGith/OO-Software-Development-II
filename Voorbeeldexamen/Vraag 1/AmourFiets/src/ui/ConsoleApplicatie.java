package ui;

import domein.DomeinController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleApplicatie {
    private DomeinController domeinController;

    public ConsoleApplicatie(DomeinController domeinController) {
        this.domeinController = domeinController;
    }

    public void start() {
        int keuze;

        do {
            keuze = maakKeuzeUitMenu();

            switch (keuze) {
                case 1:
                    toonOverzichtFietsen();
                    break;
                case 2:
                    toonOverzichtVouwfietsen();
                    break;
                case 3:
                    toonGesorteerdOverzichtMountainbikes();
                    break;
            }
        } while (keuze != 0);
    }

    private int maakKeuzeUitMenu() {
        Scanner input = new Scanner(System.in);
        String uitvoer = String.format("Menu%n1. Lijst van alle fietsen%n2. Lijst van alle vouwfietsen%n3. Gesorteerde lijst van alle mountainbikes%n0. Stoppen%n");
        boolean herhaal = true;
        int keuze = 0;

        do {
            try {
                System.out.print(uitvoer);
                System.out.print("Maak je keuze: ");
                keuze = input.nextInt();
                herhaal = false;
            } catch (InputMismatchException ime) {
                System.err.println("Gelieve een getal in te voeren");
                input.nextLine();
            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
            }

        } while (herhaal);

        return keuze;
    }

    private void toonOverzichtFietsen() {
        drukTabelAf(domeinController.geefOverzichtFietsen());
    }

    private void toonOverzichtVouwfietsen() {
        drukTabelAf(domeinController.geefOverzichtVouwfietsen());
    }

    private void toonGesorteerdOverzichtMountainbikes() {
        drukTabelAf(domeinController.geefGesorteerdOverzichtMountainbikes());
    }

    private void drukTabelAf(String[] overzicht) {
        for (String s : overzicht) {
            System.out.printf("%s %n", s);
        }
    }
}


