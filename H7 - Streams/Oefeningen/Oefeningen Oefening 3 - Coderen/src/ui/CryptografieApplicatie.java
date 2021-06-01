package ui;

import domein.DomeinController;

import java.util.Scanner;

public class CryptografieApplicatie {
    private DomeinController domeinController;

    public CryptografieApplicatie(DomeinController domeinController) {
        this.domeinController = domeinController;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.print("Geef je te coderen bericht in: ");
        String bericht = in.nextLine();

        domeinController.codeerBericht(bericht);
        System.out.println("Gecodeerd = " + domeinController.geefGecodeerdBericht());
    }
}
