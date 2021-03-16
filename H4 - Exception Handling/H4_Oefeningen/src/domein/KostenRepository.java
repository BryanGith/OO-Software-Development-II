package domein;

import java.util.List;
import persistentie.KostenMapper;

public class KostenRepository
{
    private final List<Kosten> lijstje;
    private final KostenMapper km;
	
    public KostenRepository()
    {
	km = new KostenMapper();
	lijstje = km.geefKostenLijst();
    } 
    public String geefOverzichtAantalDocumenten()
    {
            int pa = 0, pbt = 0, t = 0;
            for (Kosten k: lijstje)
            {
                    if (k instanceof Ticket) t++;
                    else if (k instanceof VerplaatsingPerAuto) pa++;
                    else pbt++;
            }
            return "Volgende documenten werden ingediend:\n"
                    + t + " ticket(s), " + pa + " verplaatsing(en) per auto en " + pbt + 
                    " verplaatsing(en) per bus/tram.\n\n";
    }
    
    
    
    public String geefKostenLijst()
    {
            double prijs, prijsZonderBtw, totaal = 0;
            String output = "Overzicht gemaakte kosten:\n\n";
            output += String.format("%70s%15s\n", "Kostenpost", "Bedrag");
            for (Kosten k: lijstje)
            {
                    if (k instanceof Ticket)
                    {   
                        prijs = k.berekenPrijs();
                        totaal += prijs;
                        output += String.format("%70s%15.2f\n", ((Ticket) k).getOmschrijving(), prijs);
                    }
                    else // k is een Verplaatsing
                    {
                            prijsZonderBtw = k.berekenPrijs() / 1.21;
                            totaal += prijsZonderBtw;
                            output += String.format("%70s%15.2f\n", k, prijsZonderBtw);
                    }
            }
            output += String.format("\n\nTotaal gedeclareerde kosten = %7.2f\n",totaal);
            return output;
    }
    
}
