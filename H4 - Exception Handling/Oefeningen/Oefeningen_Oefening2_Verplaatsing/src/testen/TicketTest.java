package testen;

import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Ticket;

public class TicketTest {

    private Ticket t;

    @BeforeEach
    public void before() {
        Locale.setDefault(new Locale("nl", "BE"));  //wijzigt taal van JVM, niet volledige PC
        t = new Ticket("parkeerTicket", 5.5);
    }

    public void maakTicket_zonderOmschrijving_werptException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Ticket(null, 5.5));
    }

    public void maakTicket_legeOmschrijving_werptException() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Ticket("", 5.5));
    } 
    
    @Test
    public void maakTicket_omschrijvingEnprijs_maaktObject() {
        Assertions.assertEquals("parkeerTicket", t.getOmschrijving());
        Assertions.assertEquals(5.5, t.getPrijs(), 0.01);
    }

    public void maakTicket_prijsNegatieveWaarde_maaktObject() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Ticket("parkeerTicket", -2.5));
    }

    public void maakTicket_grensWaarde0_maaktObject() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Ticket("parkeerTicket", 0));
    }

    @Test
    public void setPrijs_waardePositief_attribuutKrijgtWaarde() {
        t.setPrijs(8.2);
        Assertions.assertEquals(8.2, t.getPrijs(), 0.01);
    }

    public void setPrijs_waardeNegatief_werptException() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> t.setPrijs(-8.2));
    }

    public void setPrijs_grensWaarde0_werptException() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> t.setPrijs(0));
    }

    @Test
    public void berekenPrijs_normaalGeval_geeft5Punt5Terug() {
        Assertions.assertEquals(5.5, t.berekenPrijs(), 0.01);
    }

    @Test
    public void toString_normaalGeval_geeftObjectInStringvorm() {
        Assertions.assertEquals("       parkeerTicket      5,50", t.toString());
    }

}
