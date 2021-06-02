package testen;

import exceptions.FormatException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Mountainbike;
import domein.Soort;

public class MountainbikeTest
{
   private Mountainbike mtb1;
    
    @BeforeEach
    public void before() throws FormatException
    {
        mtb1 = new Mountainbike(29,40.0,Soort.XC);
    }
    @Test
    public void verhoogMaxSnelheid_wijzigtAttribuut()
    {
        mtb1.verhoogMaxSnelheid();
        Assertions.assertEquals(44.0, mtb1.getMaxSnelheid(),0.01);
    }
    @Test
    public void isPlooibaar_levertCorrecteWaarde()
    {
        Assertions.assertEquals(false, mtb1.isPlooibaar() );
    }
    @Test
    public void maakMountainbike_aantalversnellingenTeKlein_werptException() throws FormatException
    {
         Assertions.assertThrows(IllegalArgumentException.class , () -> {new Mountainbike(-7, 15.0,Soort.FR);});
    }
}
