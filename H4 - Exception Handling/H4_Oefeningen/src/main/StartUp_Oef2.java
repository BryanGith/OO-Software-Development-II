package main;

import domein.DomeinController_Oef2;
import ui.VerplaatsingApplicatie;

public class StartUp_Oef2
{
    public static void main(String args[])
    {
    	DomeinController_Oef2 dc = new DomeinController_Oef2();
            new VerplaatsingApplicatie(dc).start();      
    }
}
