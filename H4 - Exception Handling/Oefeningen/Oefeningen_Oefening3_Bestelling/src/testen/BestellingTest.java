package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Bestelling;
import exceptions.TeGroteBestellingException;

public class BestellingTest {

	private Bestelling bestelling;

	@BeforeEach
	public void beforeEach() throws TeGroteBestellingException {
		bestelling = new Bestelling(0, 0, 0);
	}

	public void maakBestelling_limietPrintersOverschreden_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Bestelling(5, 0, 0));
	}

	public void maakBestelling_limietLaptopsOverschreden_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Bestelling(0, 3, 0));
	}

	public void maakBestelling_limietScannersOverschreden_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Bestelling(0, 0, 4));
	}

	public void maakBestelling_limietTotaleBestellingOverschreden_werptException() throws TeGroteBestellingException {
		Assertions.assertThrows(TeGroteBestellingException.class, () -> new Bestelling(3, 3, 3));
	}

	@Test
	public void setPrinters_instellenNieuweWaarde_attribuutWijzigt() {
		bestelling.setPrinters(2);
		Assertions.assertEquals(2, bestelling.getPrinters());
	}

	@Test
	public void setLaptops_instellenNieuweWaarde_attribuutWijzigt() {
		bestelling.setLaptops(2);
		Assertions.assertEquals(2, bestelling.getLaptops());
	}

	@Test
	public void setScanners_instellenNieuweWaarde_attribuutWijzigt() {
		bestelling.setScanners(2);
		Assertions.assertEquals(2, bestelling.getScanners());
	}

	public void setPrinters_grensWaarde5_werptException() {
		Assertions.assertThrows(TeGroteBestellingException.class, () -> bestelling.setPrinters(5));
	}

	public void setLaptops_grensWaarde3_werptException() {
		Assertions.assertThrows(TeGroteBestellingException.class, () -> bestelling.setLaptops(3));
	}

	public void setScanners_grensWaarde4_werptException() {
		Assertions.assertThrows(TeGroteBestellingException.class, () -> bestelling.setScanners(4));
	}

	@Test
	public void toString_infoOpvragen_geeftTekstWeergaveObject() {
		Assertions.assertEquals("Bestelling van 0 printers, 0 laptops en 0 scanners", bestelling.toString());
	}
}
