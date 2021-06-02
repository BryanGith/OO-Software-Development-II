package domein;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

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
        int factor = 1;
        if (!encryptie)
            factor = -1;
        String uitvoer = "";
        String res[] = inhoud.split("\\s+");
        for (int i = 0;i < res.length;i++)
        {
            res[i] = crypteerWoord(res[i], (i+1)*factor);
            uitvoer += res[i] + " ";
        }
        return uitvoer;
    }  
    private String crypteerWoord(String woord, int verschuiving)
    {
        StringBuilder stb = new StringBuilder(woord);
        for (int i = 0;i < stb.length();i++)
        {    
            char huidigKar = stb.charAt(i);
            if (Character.isAlphabetic(huidigKar))
            {
                char beginKar = Character.isUpperCase(huidigKar) ? 'A' : 'a';
                int getalwaarde = huidigKar;
                getalwaarde += verschuiving;
                int verschil = getalwaarde - (beginKar + AANTAL_LETTERS);
                if (verschil >= 0)
                    getalwaarde = beginKar + verschil;
                if (verschil < -AANTAL_LETTERS)
                    getalwaarde = beginKar + verschil + 2 * AANTAL_LETTERS;
                char nieuwKar = (char) getalwaarde;
                stb.setCharAt(i, nieuwKar);
            }
        }
        return stb.toString();	
    }
}