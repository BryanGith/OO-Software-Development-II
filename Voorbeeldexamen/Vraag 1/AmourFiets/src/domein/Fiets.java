package domein;

import exceptions.NegatiefException;

public abstract class Fiets {
    private int aantalVersnellingen;
    private double maxSnelheid;

    public Fiets() {
        this(3, 20.3);
    }

    public Fiets(int aantalVersnellingen, double maxSnelheid) {
        setAantalVersnellingen(aantalVersnellingen);
        setMaxSnelheid(maxSnelheid);
    }

    public abstract void verhoogMaxSnelheid();

    @Override
    public String toString() {
        return String.format("%s met %d versnellingen en %.2f als maximale snelheid", this.getClass().getSimpleName(), aantalVersnellingen, maxSnelheid);
    }

    public int getAantalVersnellingen() {
        return aantalVersnellingen;
    }

    public void setAantalVersnellingen(int aantalVersnellingen) {
        if (aantalVersnellingen <= 0)
            throw new NegatiefException("Aantal versnellingen moet positief zijn");
        this.aantalVersnellingen = aantalVersnellingen;
    }

    public double getMaxSnelheid() {
        return maxSnelheid;
    }

    public void setMaxSnelheid(double maxSnelheid) {
        this.maxSnelheid = maxSnelheid;
    }
}
