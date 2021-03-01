package main;

import domein.DomeinController_Oef2;
import ui.VoorwerpApplicatie;

public class StartUp_Oef3 
{
    public static void main(String[] args) 
    {
        DomeinController_Oef2 dc = new DomeinController_Oef2();
        new VoorwerpApplicatie(dc).start();
    }
}
