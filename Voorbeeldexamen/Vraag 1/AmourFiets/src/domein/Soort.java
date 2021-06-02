package domein;

public enum Soort
{
    XC("Cross country"),
    EN("Enduro"),
    FR("Free ride"),
    DH("Downhill");
    
    private final String omschrijving;
    
    Soort(String omschrijving)
    {
        this.omschrijving = omschrijving;
    }
    public String getOmschrijving()
    {
        return omschrijving;
    }
}