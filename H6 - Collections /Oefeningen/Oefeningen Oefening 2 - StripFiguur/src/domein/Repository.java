package domein;

import persistentie.StripFiguurMapper;

import java.util.*;

public class Repository {
    private final List<StripFiguur> lijstStripFiguren;
    private final StripFiguurMapper mapper;

    public Repository() {
        mapper = new StripFiguurMapper();
        lijstStripFiguren = new ArrayList<>(Arrays.asList(mapper.geefStripfiguren()));

    }

    public List<StripFiguur> getLijstStripFiguren() {
        return lijstStripFiguren;
    }

    public List<StripFiguur> getLijstStripFigurenGesorteerdOpNaam() {
        List<StripFiguur> stripFiguurs = lijstStripFiguren;
        Collections.sort(stripFiguurs, new Comparator<StripFiguur>() {
            @Override
            public int compare(StripFiguur sf1, StripFiguur sf2) {
                return sf1.getNaam().compareTo(sf2.getNaam());
            }
        });
        return stripFiguurs;
    }

    public List<StripFiguur> getLijstStripFigurenGesorteerdOpAflopendeGrootte() {
        List<StripFiguur> stripFiguurs = lijstStripFiguren;
        Collections.sort(stripFiguurs, Comparator.comparing(stripFiguur -> stripFiguur.getGrootte()));
        return stripFiguurs;
    }

    public Set<StripFiguur> haalDubbelsEruit() {
        return new HashSet<>(lijstStripFiguren);
    }

    public List<StripFiguur> pick3() {
        Collections.shuffle(lijstStripFiguren);
        return lijstStripFiguren.subList(0, 3);
    }

    public void voegStripFiguurToe(String naam, double grootte) {
        lijstStripFiguren.add(new StripFiguur(naam, grootte));
    }

    public void voegExtraStripfigurenToe() {
        List<StripFiguur> extraStripfiguur = Arrays.asList(mapper.geefExtraStripfiguren());
        lijstStripFiguren.addAll(extraStripfiguur);

    }

}
