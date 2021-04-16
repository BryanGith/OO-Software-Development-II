package ui;

import domein.DomeinController;


public class VoorwerpApplicatie
{
    private DomeinController dc;

    public VoorwerpApplicatie(DomeinController dc) {
        this.dc = dc;
    }
    
    
    public void start()
    {
    	System.out.println("Beginsituatie:");
    	System.out.printf("%s%n%n", dc.geefOverzicht());
        dc.voegWapenToe("Colt", 1.5, 3, 6, false);
        dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
        dc.voegWapenToe("Brown", 0.5, 1, 23, true);
        dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);
        System.out.println("Na het toevoegen van enkele wapens en sleutels:");
        System.out.printf("%s", dc.geefOverzicht());
    }
}
