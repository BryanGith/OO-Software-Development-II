package main;

import domein.DomeinController_Oef1;
import ui.DraagbaarApplicatie;

public class StartUp_Oef1 
{
    public static void main(String[] args) 
    {
        DomeinController_Oef1 dc = new DomeinController_Oef1();
        new DraagbaarApplicatie(dc).start();
    }
}
