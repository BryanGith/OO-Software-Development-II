package domein;

public class Passagier {
    private final String naam;
    private final int nummer;
    private double aantalKgBagage;
    private final boolean businessClass;

    public Passagier(String naam, double aantalKgBagage, int nummer) {
        this.naam = naam;
        this.nummer = nummer;

        this.setAantalKgBagage(aantalKgBagage);

        businessClass = this.nummer < 50;
    }

    public String getNaam() {
        return naam;
    }

    public double getAantalKgBagage() {
        return aantalKgBagage;
    }

    public final void setAantalKgBagage(double aantalKgBagage) {
        if (aantalKgBagage > 0 && aantalKgBagage <= 20)
            this.aantalKgBagage = aantalKgBagage;
        else
            throw new IllegalArgumentException("Foutieve waarde!");
    }

    public int getNummer() {
        return nummer;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public double berekenPrijs() {
        final double BASISPRIJS = 350;
        double teBetalen = BASISPRIJS;
        if (businessClass)
            teBetalen = BASISPRIJS * 1.15;
        else if (aantalKgBagage >= 15)
            teBetalen = BASISPRIJS * 1.10;
        else if (aantalKgBagage >= 10)
            teBetalen = BASISPRIJS * 1.05;
        return teBetalen;
    }

    public String toString() {
        return String.format("%4d: %s (bagage: %.1f)", nummer, naam, aantalKgBagage);

    }

}

