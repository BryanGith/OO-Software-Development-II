package main;

import domein.DomeinController;
import ui.VerplaatsingApplicatie;

public class StartUp
{
    public static void main(String args[])
    {
            new VerplaatsingApplicatie(new DomeinController()).start();      
    }
}
