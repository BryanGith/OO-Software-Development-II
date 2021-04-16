package persistentie;

import domein.Kosten;
import domein.Ticket;
import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;
import java.util.ArrayList;
import java.util.List;

public class KostenMapper
{

    public List<Kosten> geefKostenLijst()
    {
        List<Kosten> deLijst = new ArrayList<>();

        deLijst.add(new VerplaatsingPerBusTram("Voskenslaan Gent", "Veldstraat Gent", 4.2, 1, false, true));
        deLijst.add(new Ticket("Parkeerticket Flanders Expo", 5));
        deLijst.add(new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.591, 0.0538));
        deLijst.add(new Ticket("Toegangsticket beurs", 10));
        deLijst.add(new VerplaatsingPerBusTram("Laarne dorp", "Gent Sint-Pieters", 14.6, 34, true, false));
        deLijst.add(new VerplaatsingPerAuto("Gent", "Brussel", 53.7, 1.488, 0.0692));
        deLijst.add(new VerplaatsingPerAuto("Gent", "Kortrijk", 47.1, 1.649, 0.034));
        return deLijst;

    }
}
