package testen;

import domein.Namen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NamenTest
{
    private Namen n1, n2;

    @BeforeEach
    public void before()
    {
        n1 = new Namen("Roobrouck");
        n2 = new Namen("Janssens");
    }
    
    @Test
    public void maakNamen_toegelatenWaarde_maaktObject()
    {
        Assertions.assertEquals("Roobrouck", n1.getTeZoeken());
    }    
    
    @Test
    public void setTeZoeken_NullNaam_werptException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> n2.setTeZoeken(null));
    }
    
    @Test
    public void setTeZoeken_geldigeNaam_nieuwTeZoeken()
    {
        n2.setTeZoeken("Vuyge");
        Assertions.assertEquals("Vuyge", n2.getTeZoeken());
    }
    
    @Test
    public void isAanwezig_n1_teZoekenGevonden()
    {
        Assertions.assertTrue(n1.isAanwezig());
    }

    @Test
    public void isAanwezig_n2_teZoekenNietGevonden()
    {
        Assertions.assertFalse(n2.isAanwezig());
    }

    @Test
    public void geefAantalVorigeNamen_n1_geeftAantalVorigeNamen()
    {
        Assertions.assertEquals(4, n1.geefAantalVorigeNamen());
    }
}
