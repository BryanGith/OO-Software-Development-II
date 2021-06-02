package testen;

import exceptions.FormatException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import domein.Vouwfiets;

public class VouwfietsTest
{
    private Vouwfiets vf1,vf2;
    
    @BeforeEach
    public void before() throws FormatException
    {
        vf1 = new Vouwfiets(7,20.0,"Heeft een cardanas");
        vf2 = new Vouwfiets();
    }
    @Test
    public void verhoogMaxSnelheid_wijzigtAttribuut()
    {
        vf1.verhoogMaxSnelheid();
        Assertions.assertEquals(23.0, vf1.getMaxSnelheid(),0.01);
    }
    @Test
    public void isPlooibaar_levertCorrecteWaarde()
    {
        Assertions.assertEquals(true, vf2.isPlooibaar() );
    }
    @Test
    public void maakVouwfiets_met3attributen_maaktObject()
    {
        Assertions.assertThrows(FormatException.class , () -> {new Vouwfiets(3, 15.0,"weet niet");});
    }
    @Test
    public void maakVouwfiets_aantalversnellingenTeKlein_werptException() throws FormatException
    {
         Assertions.assertThrows(IllegalArgumentException.class , () -> {new Vouwfiets(-7, 15.0,"Niets");});
    }
}
