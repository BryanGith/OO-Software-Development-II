package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.MijnString;

public class MijnStringTest 
{
    private MijnString str1, str2, str3, str4, str5;

    @BeforeEach
    public void before()
    {
        str1 = new MijnString("Dit is een testje");
        str2 = new MijnString("Zondag schijnt de zon");
        str3 = new MijnString("fout");
        str4 = new MijnString("ffo itqqv jhkhlp");
        str5 = new MijnString("iffm dabqpfgt");
    }
    
    @Test
    public void maakMijnString_toegelatenWaarden_maaktObject()
    {
        Assertions.assertEquals("Dit is een testje",str1.getInhoud());
    }

    @Test
    public void setInhoud_legeInhoud_werptExceptie()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> str3.setInhoud(""));
    }

    @Test
    public void setInhoud_NullInhoud_werptExceptie()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> str3.setInhoud(null));
    }

    @Test
    public void crypteerZin_inhoud_geeftCorrecteEncryptie()
    {
        String encryptie = str1.crypteerZin(true);
        Assertions.assertEquals("Eju ku hhq xiwxni", encryptie);
    }
    
    @Test
    public void crypteerZin_inhoudMetOverloop_geeftCorrecteEncryptie()
    {
        String encryptie = str2.crypteerZin(true);
        Assertions.assertEquals("Apoebh uejklpv gh dsr", encryptie);
    }

    @Test
    public void crypteerZin_inhoud_geeftCorrecteDecryptie()
    {
        String decryptie = str4.crypteerZin(false);
        Assertions.assertEquals("een groot geheim", decryptie);
    }
    
    @Test
    public void crypteer_inhoudMetOverloop_geeftCorrecteDecryptie()
    {
        String decryptie = str5.crypteerZin(false);
        Assertions.assertEquals("heel byzonder", decryptie);
    }
}