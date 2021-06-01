package main;

import domein.DomeinController;
import ui.CryptografieApplicatie;


public class StartUp {

    public static void main(String[] args) {
        new CryptografieApplicatie(new DomeinController()).start();

    }

}
