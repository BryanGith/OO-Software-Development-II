package main;

import domein.DomeinController;
import ui.DraagbaarApplicatie;

public class StartUp 
{
    public static void main(String[] args) 
    {
        DomeinController dc = new DomeinController();
        new DraagbaarApplicatie(dc).start();
    }
}
