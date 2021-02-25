package ui;

import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie
{
    public void start()
    {
        VerplaatsingPerAuto[] vp1 = new VerplaatsingPerAuto[2];
        VerplaatsingPerBusTram[] vp2 = new VerplaatsingPerBusTram[2];

        vp1[0] = new VerplaatsingPerAuto("HoGent campus Schoonmeersen Gent",
                "EFFIX Waregem", 35.4, 1.32, 0.049);
        vp1[1] = new VerplaatsingPerAuto("HoGent campus Aalst",
                "Brenso NV Affligem", 11.9, 1.37, 0.058);
        vp2[0] = new VerplaatsingPerBusTram("HoGent campus Schoonmeersen Gent",
                "Technologiepark Zwijnaarde", 4.7, 70, true, true);
        vp2[1] = new VerplaatsingPerBusTram("Sint-Pietersstation Gent",
                "Vijfwindgatenstraat Gent", 3, 22, false, true);

        double kosten, totaleKosten = 0;
        for (VerplaatsingPerAuto auto : vp1)
        {
            System.out.println(auto);
            kosten = auto.berekenPrijs();
            System.out.printf("Kosten voor deze verplaatsing: € %.2f%n", kosten);
            System.out.println();
            totaleKosten += kosten;
        }
        for (VerplaatsingPerBusTram bustram : vp2)
        {
            System.out.println(bustram);
            kosten = bustram.berekenPrijs();
            System.out.printf("Kosten voor deze verplaatsing: € %.2f%n", kosten);
            System.out.println();
            totaleKosten += kosten;
        }
        System.out.printf("Totale kosten voor alle verplaatsingen samen: € %.2f%n", totaleKosten);
    }

}
