package main;

import domein.DomeinController;
import ui.DraagbaarApplicatie;

public class StartUp 
{
    public static void main(String[] args) 
    {
        new DraagbaarApplicatie(new DomeinController()).start();
    }
}
