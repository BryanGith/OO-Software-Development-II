package domein;

import java.util.Comparator;

public class MountainbikesVergelijkenOpAantalVersnellingenEnMaximaleSnelheid implements Comparator<Mountainbike> {

    @Override
    public int compare(Mountainbike m1, Mountainbike m2) {
        if (m1.getAantalVersnellingen() == m2.getAantalVersnellingen())
            return Double.compare(m1.getMaxSnelheid(), m2.getMaxSnelheid());
        return Integer.compare(m1.getAantalVersnellingen(), m2.getAantalVersnellingen());
    }
}
