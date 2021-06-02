package domein;

import java.util.List;

public class DomeinController {
    private final PassagierRepository passagierRepository;

    public DomeinController() {
        passagierRepository = new PassagierRepository();
    }

    public void filterOp(int filternr, String filter) {
        switch (filternr) {
            case 0 -> passagierRepository.filterOpNaamBeginnendMet(filter.charAt(0));
            case 1 -> passagierRepository.filterOpAantalKgBagage(Double.parseDouble(filter));
            case 2 -> passagierRepository.filterOpClass(filter);
            default -> System.out.println("de nada");
        }

    }

    public String[] geefGefilterdeLijstPassagiers() {
        List<Passagier> gefilterdeLijst = passagierRepository.getGefilterd();
        String[] array = new String[gefilterdeLijst.size()];

        int index = 0;
        for (Passagier passagier : gefilterdeLijst)
            array[index++] = passagier.toString();

        return array;
    }

    public String[] geefPassagierLijst() {
        List<Passagier> passagierList = passagierRepository.getPassagiers();
        String[] array = new String[passagierList.size()];

        int index = 0;
        for (Passagier p : passagierList)
            array[index++] = p.toString();

        return array;
    }

    public String[] leesTekstBestand(String naamBestand) {
        List<Passagier> passagiers = passagierRepository.leesTekstBestand(naamBestand);
        return omzettenNaarTekst(passagiers);
    }

    public String[] omzettenNaarTekst(List<Passagier> passagiers) {
        String[] spelersTekst = new String[passagiers.size()];
        int i = 0;
        for (Passagier s : passagiers)
            spelersTekst[i++] = s.toString();
        return spelersTekst;
    }
}
