package domein;

public class MijnString
{
    private String inhoud;
    private final static int AANTAL_LETTERS = 26;

    public MijnString() {}
    public MijnString(String inhoud) 
    { 
        setInhoud(inhoud);
        this.inhoud = inhoud;
    }
    public String getInhoud() 
    { 
        return inhoud; 
    }
    public final void setInhoud(String inhoud)
    { 
        if (inhoud == null || inhoud.equals(""))
            throw new IllegalArgumentException("Zin is niet ingevuld");
        this.inhoud = inhoud;
    }  
    public String crypteerZin(boolean encryptie)
    {
 
    }  
    private String crypteerWoord(String woord, int verschuiving)
    {
    	
    }
}