package domein;

import persistentie.PassagierMapper;

import java.util.ArrayList;
import java.util.List;

public class PassagierRepository {
    private final PassagierMapper pm;
    private final List<Passagier> passagiers;
    private List<Passagier> gefilterd;

    public PassagierRepository() {
        pm = new PassagierMapper();
        passagiers = pm.geefPassagiers();
    }

    public void filterOpAantalKgBagage(double grens) {
        gefilterd = new ArrayList<>();

        for (Passagier passagier : passagiers)
            if (passagier.getAantalKgBagage() <= grens)
                gefilterd.add(passagier);
    }

    public void filterOpNaamBeginnendMet(char letter) {
        gefilterd = new ArrayList<>();
        String letterGroot = String.format("%S", letter);
        String letterKlein = String.format("%s", Character.toLowerCase(letter));
        String passagierNaam;

        for (Passagier passagier : passagiers) {
            passagierNaam = passagier.getNaam();
            if (passagierNaam.startsWith(letterGroot) || passagierNaam.startsWith(letterKlein))
                gefilterd.add(passagier);
        }
    }

    public void filterOpClass(String filter) {
        gefilterd = new ArrayList<>();
        boolean value = Boolean.parseBoolean(filter);

        for (Passagier passagier : passagiers) {
            if (passagier.isBusinessClass() == value)
                gefilterd.add(passagier);
        }
    }

    public List<Passagier> getGefilterd() {
        return gefilterd;
    }

    public List<Passagier> getPassagiers() {
        return passagiers;
    }

    public List<Passagier> leesTekstBestand(String naamBestand) {
        return this.pm.leesTekstBestand(naamBestand);
    }

}
