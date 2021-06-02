package persistentie;

import domein.Fiets;
import domein.Mountainbike;
import domein.Soort;
import domein.Vouwfiets;
import exceptions.FormatException;

import java.util.ArrayList;
import java.util.List;

public class FietsMapper {
    //dummy methode om fietsenlijst te vullen
    public List<Fiets> geefFietsen() throws FormatException {
        List<Fiets> lijst = new ArrayList<>();
        lijst.add(new Vouwfiets(7, 20.0, "Heeft een cardanas"));
        lijst.add(new Mountainbike(30, 40.0, Soort.XC));
        lijst.add(new Mountainbike(30, 35.0, Soort.FR));
        lijst.add(new Mountainbike(10, 30.0, Soort.DH));
        lijst.add(new Vouwfiets(3, 25.0, "Nihil"));

        return lijst;
    }
}
