package domein;

public class Mountainbike extends Fiets {
    private Soort soort;

    public Mountainbike(int aantalVersnellingen, double maxSnelheid, Soort soort) {
        super(aantalVersnellingen, maxSnelheid);
        this.soort = soort;

    }

    public boolean isPlooibaar() {
        return false;
    }

    @Override
    public void verhoogMaxSnelheid() {
        setMaxSnelheid(getMaxSnelheid() * 1.1);
    }

    @Override
    public String toString() {
        return String.format("%s, soort: %s", super.toString(), soort.getOmschrijving());
    }
}
