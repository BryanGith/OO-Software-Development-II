package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import domein.Thermometer_Deel2;

public class ThermometerTest_Deel2 {
	private Thermometer_Deel2 t;

	@BeforeEach
	public void before() {
		t = new Thermometer_Deel2();
	}

	@Test
	public void maakThermometer_defaultWaardeAantalGraden_maaktObject() {
		Assertions.assertEquals(32, t.getAantalGraden());
	}

	@Test
	public void maakThermometer_aantalGraden14_maaktObject() {
		t = new Thermometer_Deel2(14);
		Assertions.assertEquals(14, t.getAantalGraden());
	}


    @Test 
    public void maakThermometer_aantalGraden105_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Thermometer_Deel2(105);});
    }

	@Test
	public void maakThermometer_aantalGraden104_maaktObject() {
		t = new Thermometer_Deel2(104);
		Assertions.assertEquals(104, t.getAantalGraden());
	}


    @Test 
    public void maakThermometer_aantalGraden13_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Thermometer_Deel2(13);});
    }
	
	@Test
	public void converteerNaarCelcius_50F_geeft10C() {
		t = new Thermometer_Deel2(50);
		int conversie = t.converteerNaarCelcius();
		Assertions.assertEquals(10, conversie);
	}

	@Test
	public void converteerNaarCelcius_35F_geeft1C() {
		t = new Thermometer_Deel2(35);
		int conversie = t.converteerNaarCelcius();
		Assertions.assertEquals(1, conversie);
	}


}