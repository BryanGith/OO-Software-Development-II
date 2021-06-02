package domein;

import exceptions.FormatException;

import java.util.List;

public class DomeinController {
    private final FietsRepository fietsRepository;

    public DomeinController() throws FormatException {
        fietsRepository = new FietsRepository();
    }

    public String[] geefOverzichtFietsen() {
        return lijstOmzettenNaarTekst(fietsRepository.getFietsenLijst());
    }

    public String[] geefOverzichtVouwfietsen() {
        return lijstOmzettenNaarTekst(fietsRepository.geefVouwfietsenLijst());
    }

    public String[] geefGesorteerdOverzichtMountainbikes() {
        return lijstOmzettenNaarTekst(fietsRepository.geefGesorteerdeMountainbikesLijst());
    }

    private String[] lijstOmzettenNaarTekst(List<Fiets> fietsenLijst) {
        return fietsenLijst.stream().map(Fiets::toString).toArray(size -> new String[size]);
    }
}

