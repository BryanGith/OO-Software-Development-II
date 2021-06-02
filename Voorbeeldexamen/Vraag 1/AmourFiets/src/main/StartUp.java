package main;

import domein.DomeinController;
import exceptions.FormatException;
import ui.ConsoleApplicatie;

public class StartUp {
    public static void main(String[] args) throws FormatException {
        new ConsoleApplicatie(new DomeinController()).start();
    }
}
