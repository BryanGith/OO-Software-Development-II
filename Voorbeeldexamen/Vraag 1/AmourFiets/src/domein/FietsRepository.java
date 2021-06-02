package domein;

import exceptions.FormatException;
import persistentie.FietsMapper;

import java.util.List;
import java.util.stream.Collectors;

public class FietsRepository {
    private List<Fiets> fietsenLijst;
    private FietsMapper fietsMapper;

    public FietsRepository() throws FormatException {
        fietsMapper = new FietsMapper();
        fietsenLijst = fietsMapper.geefFietsen();

    }

    public List<Fiets> getFietsenLijst() {
        return fietsenLijst;
    }

    public List<Fiets> geefVouwfietsenLijst() {
        return fietsenLijst.stream().filter(fiets -> fiets instanceof Vouwfiets).collect(Collectors.toList());
    }

    public List<Fiets> geefGesorteerdeMountainbikesLijst() {
        return fietsenLijst.stream().filter(fiets -> fiets instanceof Mountainbike)
                .map(fiets -> (Mountainbike) fiets).
                        sorted(new MountainbikesVergelijkenOpAantalVersnellingenEnMaximaleSnelheid()).
                        collect(Collectors.toList());
    }


}
