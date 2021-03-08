package ui;

import domein.DomeinController_Oef3;

public class VerplaatsingApplicatie
{
    private DomeinController_Oef3 dc;

    public VerplaatsingApplicatie(DomeinController_Oef3 dc)
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
