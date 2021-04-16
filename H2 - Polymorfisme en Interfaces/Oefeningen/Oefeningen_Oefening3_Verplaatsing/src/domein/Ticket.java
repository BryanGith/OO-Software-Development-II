package domein;

public class Ticket implements Kosten
{
    private String omschrijving;
    private double prijs;

    public Ticket(String omschrijving, double prijs)
    {
        setOmschrijving(omschrijving);        
        setPrijs(prijs);     
    }

    public final void setOmschrijving(String omschrijving)
    {
         if (omschrijving == null || omschrijving.trim().isEmpty())
            throw new IllegalArgumentException("Elk ticket moet verplicht een omschrijving hebben.");
         this.omschrijving = omschrijving;
    }
    
    public final void setPrijs(double prijs){
        if (prijs <= 0)
        {
            throw new IllegalArgumentException("Prijs van het ticket moet groter dan 0 zijn!");
        }
        this.prijs = prijs;
    }
    
    public String getOmschrijving()
    {
        return omschrijving;
    }

    public double getPrijs()
    {
        return prijs;
    }

    @Override
    public String toString()
    {
        return String.format("%20s%10.2f", omschrijving, prijs);
    }

    @Override
    public double berekenPrijs()
    {
        return prijs;
    }

}
