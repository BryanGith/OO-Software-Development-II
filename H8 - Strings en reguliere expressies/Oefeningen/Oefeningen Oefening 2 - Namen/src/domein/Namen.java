package domein;

import persistentie.NamenMapper;

public class Namen {
    private NamenMapper namenMapper;
    private String[] lijstNamen;
    private final String[][] gesorteerd = new String[26][];
    private final int teller[] = new int[26]; // per letter
    private String teZoeken;

    public Namen(String teZoeken) {
        if (namenMapper == null) {
            namenMapper = new NamenMapper();
            lijstNamen = namenMapper.geefNamenlijst();
            setTeller();
            setGesorteerd();
        }
        setTeZoeken(teZoeken);
    }

    public final void setTeZoeken(String teZoeken) {
        if (teZoeken == null || teZoeken.isEmpty())
            throw new IllegalArgumentException("Vul de te zoeken naam in!");
        this.teZoeken = teZoeken;
    }

    public String getTeZoeken() {
        return teZoeken;
    }

    private void setTeller() {
        for (String naam : lijstNamen) {
            char eersteLetter = naam.charAt(0);
            teller[eersteLetter - 'A']++;
        }
    }

    private void setGesorteerd() {
        for (String naam : lijstNamen) {
            char eersteLetter = naam.charAt(0);
            int index = eersteLetter - 'A';
            if (gesorteerd[index] == null)
                gesorteerd[index] = new String[teller[index]];
            voegIn(naam, gesorteerd[index]);
        }
    }

    private void voegIn(String naam, String[] rij) {
        int index = 0;
        while (index < rij.length && rij[index] != null) {
            if (rij[index].compareTo(naam) > 0) {
                String hulp = rij[index];
                rij[index] = naam;
                naam = hulp;
            }
            index++;
        }
        rij[index] = naam;
    }

    public boolean isAanwezig() {
        int rijIndex = teZoeken.charAt(0) - 'A';
        int kolIndex = 0;
        if (gesorteerd[rijIndex] != null) {
            while (kolIndex < gesorteerd[rijIndex].length &&
                    gesorteerd[rijIndex][kolIndex] != null &&
                    gesorteerd[rijIndex][kolIndex].compareTo(teZoeken) <= 0) {
                if (gesorteerd[rijIndex][kolIndex].compareTo(teZoeken) == 0)
                    return true;
                kolIndex++;
            }
        }
        return false;
    }

    public int geefAantalVorigeNamen() {
        int rijIndex = teZoeken.charAt(0) - 'A';
        int aantal = 0;
        for (int rijnr = 0; rijnr < rijIndex; rijnr++)
            if (gesorteerd[rijnr] != null)
                aantal += gesorteerd[rijnr].length;
        int kolIndex = 0;
        while (kolIndex < gesorteerd[rijIndex].length &&
                gesorteerd[rijIndex][kolIndex] != null &&
                gesorteerd[rijIndex][kolIndex].compareTo(teZoeken) < 0) {
            aantal++;
            kolIndex++;
        }
        return aantal;
    }
}