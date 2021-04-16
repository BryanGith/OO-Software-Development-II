package main;

import domein.DomeinController;
import ui.VerplaatsingApplicatie;

public class StartUp
{
    public static void main(String args[])
    {
            DomeinController dc = new DomeinController();
            new VerplaatsingApplicatie(dc).start();      
    }
}
