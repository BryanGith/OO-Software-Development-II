package ui;

import domein.DomeinController;

public class VerplaatsingApplicatie
{
    private DomeinController dc;

    public VerplaatsingApplicatie(DomeinController dc)
    {
        this.dc = dc;
    }

    public void start()
    {
        String uitvoer = dc.geefOverzichtAantalDocumenten();
        uitvoer += dc.geefKostenLijst();
        System.out.printf(uitvoer);
    }

}
