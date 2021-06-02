package domein;

public class EigenString 
{
    private String tekst;

    public EigenString(String tekst) 
    { 
        setTekst(tekst);
    }
    public String getTekst() 
    { 
        return tekst; 
    }
    public final void setTekst(String tekst) 
    { 
        if (tekst == null || tekst.isEmpty())
            throw new IllegalArgumentException("Tekst moet ingevuld zijn!");
        this.tekst = tekst;
    }
    public void vergroot()
    {
        tekst = String.format("   %s  ", tekst);
    }
    public int verklein()
    {
        StringBuilder sbTekst = new StringBuilder(tekst);
        int positieSpatie = sbTekst.indexOf(" ");
        int aantalSpaties = 0;
        while (positieSpatie >= 0)
        {
            aantalSpaties++;
            sbTekst.deleteCharAt(positieSpatie);
            positieSpatie = sbTekst.indexOf(" ");
        }  
        tekst = sbTekst.toString();
        return aantalSpaties;
    }
}
