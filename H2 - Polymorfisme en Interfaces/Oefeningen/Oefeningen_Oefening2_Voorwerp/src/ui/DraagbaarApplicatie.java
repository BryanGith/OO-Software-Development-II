package ui;

import domein.DomeinController;

public class DraagbaarApplicatie
{
    private final DomeinController dc;

    public DraagbaarApplicatie(DomeinController dc)
    {
        this.dc = dc;
    }
    

    public void start()
    {
        dc.voegWapenToe("Colt", 1.5, 3, 6, false);
        dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
        dc.voegWapenToe("Brown", 0.5, 1, 23, true);
        dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);

        dc.voegGebouwToe("residentie Frankenstein", 4.5);

        System.out.printf("%s", dc.geefOverzicht());
    }
}
