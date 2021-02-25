package domein;

public class Wapen extends Voorwerp {

    private int kracht;
    private boolean gebruikt;

    public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
        super(naam, gewicht, niveau);
        controleerNiveau(niveau);
        setKracht(kracht);
        setGebruikt(gebruikt);
    }

    private void controleerNiveau(int niveau) {
        if (niveau > 5) {
            throw new IllegalArgumentException("Wapens zijn enkel beschikbaar t.e.m. niveau 5!");
        }
    }

    public final void setKracht(int kracht)
    {
        if (kracht < 0)
            throw new IllegalArgumentException("Kracht moet een positief getal zijn!");
        this.kracht = kracht;
    }

    public final void setGebruikt(boolean gebruikt) {
        this.gebruikt = gebruikt;
    }

    public int getKracht() {
        return kracht;
    }

    public boolean isGebruikt() {
        return gebruikt;
    }

    @Override
    public String toString() {
        return String.format("%s en met kracht %d %s gebruikt.",
                super.toString(), kracht, gebruikt ? "al" : "nog niet");
    }
}
