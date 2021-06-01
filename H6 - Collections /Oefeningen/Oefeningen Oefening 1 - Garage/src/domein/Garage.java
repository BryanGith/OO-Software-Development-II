package domein;

import java.util.*;

public class Garage {
    private List<Onderhoud> onderhoudLijst;

    // implementeer:
    // stop alle onderhouden (~parameter) in het attribuut onderhoudLijst
    public Garage(Collection<Onderhoud> onderhouden) {
        onderhoudLijst = new ArrayList<>(onderhouden);
    }

    // implementeer:
    // retourneer een Collection met alle unieke auto's uit de onderhoudLijst
    // tip: voeg alle auto's uit de onderhoudLijst toe aan een Set om de unieke
    // auto's te hebben
    public Collection<Auto> geefAutosVoorOnderhoud() {
        Set<Auto> autoSet = new HashSet<>();
        for (Onderhoud onderhoud : onderhoudLijst) {
            autoSet.add(onderhoud.getAuto());
        }
        return autoSet;
    }

    public Collection<Onderhoud> getOnderhoudLijst() {
        return onderhoudLijst;
    }

    // implementeer:
    // sorteer de onderhoudLijst op Auto (natuurlijk ordening op nummerplaat)
    // vervolgens sorteer je voor gelijke auto's op begindatum van het onderhoud
    public void sorteerOnderhoudLijst() {
        Collections.sort(onderhoudLijst, new Comparator<Onderhoud>() {
            @Override
            public int compare(Onderhoud o1, Onderhoud o2) {
                if (o1.getAuto().equals(o2.getAuto())) {
                    return o1.getBegindatum().compareTo(o2.getBegindatum());
                }
                return o1.getAuto().compareTo(o2.getAuto());
            }
        });
    }

    // implementeer:
    // - indien je dit nog niet deed, implementeer dan eerst de methode
    // isAangrenzendMet in de klasse Onderhoud
    // - roep de hulpmethode sorteerOnderhoudLijst aan om de onderhoudLijst
    // eerst te sorteren, en
    // - voeg dan alle aangrenzende onderhouden samen tot 1 onderhoud
    public void voegAangrenzendeOnderhoudenSamen() {
        sorteerOnderhoudLijst();
        for (int index = 0; index < onderhoudLijst.size() - 1; index++) {
            if (onderhoudLijst.get(index).isAangrenzendMet(onderhoudLijst.get(index + 1))) {
                onderhoudLijst.get(index).setEinddatum(onderhoudLijst.get(index + 1).getEinddatum());
                onderhoudLijst.remove(index + 1);
                index--;
            }
        }
    }

}
