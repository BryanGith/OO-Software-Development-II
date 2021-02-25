package main;

import domein.DomeinController_Oef3;
import ui.VoorwerpApplicatie;

public class StartUp_Oef3 
{
    public static void main(String[] args) 
    {
        DomeinController_Oef3 dc = new DomeinController_Oef3();
        new VoorwerpApplicatie(dc).start();
    }
}
