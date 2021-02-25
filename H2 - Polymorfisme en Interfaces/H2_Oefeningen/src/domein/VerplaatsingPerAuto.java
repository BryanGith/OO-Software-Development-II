package domein;

public class VerplaatsingPerAuto extends Verplaatsing
{
    private double benzineprijs;    // prijs in euro per liter
    private double verbruik;        // liter per kilometer

    public VerplaatsingPerAuto
        (String van, String naar, double aantalKm, double benzineprijs, double verbruik) 
    {
        super(van, naar, aantalKm);
        setBenzineprijs(benzineprijs);
        setVerbruik(verbruik);
    }
    
  
    public final void setBenzineprijs(double benzineprijs) 
    { 
        if (benzineprijs < 0.5 || benzineprijs > 2)
            throw new IllegalArgumentException
                ("De benzineprijs moet tussen 0.5 en 2 euro liggen");
        this.benzineprijs = benzineprijs;
    }
    
    public final void setVerbruik(double verbruik) 
    { 
        if (verbruik < 0.02 || verbruik > 0.07)
            throw new IllegalArgumentException
                ("Het verbruik moet tussen de 0.02 en de 0.07 liter per km liggen");
        this.verbruik = verbruik;
    }
    
    public double getBenzineprijs()  
    { 
        return benzineprijs; 
    }
    public double getVerbruik() 
    { 
        return verbruik; 
    }
    @Override
    public String toString() 
    { 
        return String.format("%s per auto", super.toString()); 
    }
    public double berekenPrijs() 
    {
        return 2 * verbruik * benzineprijs * getAantalKm();
    }
}