package domein;

public class Voorwerp
{
    private final String naam;
    private double gewicht;
    private int niveau;

    public Voorwerp(String naam, double gewicht, int niveau)
    {
        controleerNaam(naam);
        this.naam = naam;
        setGewicht(gewicht);
        setNiveau(niveau);

    }
    public Voorwerp(String naam, double gewicht)
    {
        this(naam,gewicht,1);
    }

    private void controleerNaam(String naam) {
        if (naam == null || naam.trim().isEmpty())
            throw new IllegalArgumentException("Elk voorwerp moet verplicht een naam hebben.");
    }
    
    public final void setGewicht(double gewicht)
    {
        if (gewicht < 0 || gewicht >= 1000)
            throw new IllegalArgumentException("Gewicht moet groter of gelijk aan 0 en minder dan 1000 kg zijn");
   
        this.gewicht = gewicht;
    }
    
    public final void setNiveau(int niveau)
    {
        if (niveau < 1 || niveau > 10)
             throw new IllegalArgumentException("Niveau moet tussen 1 en 10 liggen");
  
        this.niveau = niveau;
    }
    public String getNaam()
    {
        return naam;
    }
    public double getGewicht()
    {
        return gewicht;
    }
    public int getNiveau()
    {
        return niveau;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s met gewicht %.3f kg uit niveau %d",
                this.getClass().getSimpleName(), naam, gewicht, niveau);
    }
}
