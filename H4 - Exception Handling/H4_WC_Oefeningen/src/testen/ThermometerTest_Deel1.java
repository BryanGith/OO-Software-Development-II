package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import domein.Thermometer_Deel1;

public class ThermometerTest_Deel1 {
	private Thermometer_Deel1 t;

	@BeforeEach
	public void before() {
		t = new Thermometer_Deel1();
	}

	@Test
	public void maakThermometer_defaultWaardeAantalGraden_maaktObject() {
		Assertions.assertEquals(32, t.getAantalGraden());
	}

	@Test
	public void maakThermometer_aantalGraden15_maaktObject() {
		t = new Thermometer_Deel1(15);
		Assertions.assertEquals(15, t.getAantalGraden());
	}

	@Test
	public void converteerNaarCelcius_50F_geeft10C() {
		t = new Thermometer_Deel1(50);
		int conversie = t.converteerNaarCelcius();
		Assertions.assertEquals(10, conversie);
	}

	@Test
	public void converteerNaarCelcius_35F_geeft1C() {
		t = new Thermometer_Deel1(35);
		int conversie = t.converteerNaarCelcius();
		Assertions.assertEquals(1, conversie);
	}

	@Test
	public void converteerNaarCelcius_0F_geeftMin17C() {
		t = new Thermometer_Deel1(0);
		int conversie = t.converteerNaarCelcius();
		Assertions.assertEquals(-17, conversie);
	}
}