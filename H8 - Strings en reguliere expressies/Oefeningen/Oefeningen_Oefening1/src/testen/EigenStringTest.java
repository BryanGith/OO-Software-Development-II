package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.EigenString;

public class EigenStringTest 
{
    private EigenString str1, str2;

    @BeforeEach
    public void before()
    {
        str1 = new EigenString("Dit is een test");
        str2 = new EigenString("Nog een tekstje");
    }
    
    @Test
    public void maakEigenString_toegelatenWaarden_maaktObject()
    {
        Assertions.assertEquals("Dit is een test",str1.getTekst());
    }

    @Test
    public void setText_NullTekst_werptExceptie()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> str2.setTekst(null));
    }
    
    @Test
    public void setText_LegeTekst_werptExceptie()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> str2.setTekst(""));
    }

    @Test
    public void vergroot_met3SpatiesVoorEn2SpatiesAchter_levertLangereTekst()
    {
        str1.vergroot();
        Assertions.assertEquals("   Dit is een test  ", str1.getTekst());
    }

    @Test
    public void verklein_verwijderAlleSpaties_levertkortereTekst()
    {
        int aantal = str1.verklein();
        Assertions.assertEquals("Ditiseentest", str1.getTekst());
        Assertions.assertEquals(3, aantal);
    }
}