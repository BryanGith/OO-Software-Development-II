package domein;

public class VerplaatsingPerBusTram extends Verplaatsing
{
    private int lijnnr;
    private boolean bus;
    private boolean stadslijn;
    private static final double PRIJS_PER_HALTE = 0.32;
	
    public VerplaatsingPerBusTram(String van, String naar, double aantalKm, int lijnnr, boolean bus, boolean stadslijn) 
    {
        super(van, naar, aantalKm);
        setLijnnr(lijnnr);
        setBus(bus);
        setStadslijn(stadslijn);
    }

    public final void setLijnnr(int lijnnr) 
    { 
        if (lijnnr < 0)
            throw new IllegalArgumentException("Lijnnummer moet positief zijn!");
        this.lijnnr = lijnnr;
    }
    private void setBus(boolean bus) 
    {
        this.bus = bus;
    }
    private void setStadslijn(boolean stadslijn) 
    { 
        this.stadslijn = stadslijn;
    }
    public int getLijnnr() 
    { 
        return lijnnr; 
    }
    public boolean isBus() 
    { 
        return bus; 
    }
    public boolean isStadslijn() 
    { 
        return stadslijn; 
    }
    @Override
    public String toString()
    {
        return String.format("%s met %s%d", super.toString(),(isStadslijn() ? "stads" : "") 
                + (isBus() ? "bus " : "tram "), lijnnr);
    }
    public double berekenPrijs() 
    {
        int aantalHaltes = (int) Math.ceil(getAantalKm());
        double prijs = aantalHaltes * PRIJS_PER_HALTE * 2;
        if (isStadslijn()) 
            prijs *= 0.8; 
        return prijs;
    }    
}
