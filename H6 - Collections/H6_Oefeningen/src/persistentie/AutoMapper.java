package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Auto;
import java.io.File;

public class AutoMapper {
    
    public List<Auto> geefAutos() {
        List<Auto> lijstAutos = new ArrayList<>();
        lijstAutos.add(new Auto("123xyz", "Toyota", "Yaris"));
        lijstAutos.add(new Auto("456abc", "Opel", "Astra"));
        lijstAutos.add(new Auto("azerty", "BMW", "Berline"));
        lijstAutos.add(new Auto("qwerty", "Toyota", "Avensis"));
        lijstAutos.add(new Auto("789cde", "Mercedes", "C-klasse Berline"));
        lijstAutos.add(new Auto("567xyz", "Renault", "Fluence"));
        lijstAutos.add(new Auto("ab12ab", "Opel", "Zafira"));
        lijstAutos.add(new Auto("xy12xy", "Peugeot", "308"));
        return lijstAutos;
    }
}
