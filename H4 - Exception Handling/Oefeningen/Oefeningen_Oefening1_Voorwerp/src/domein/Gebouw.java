package domein;

public class Gebouw implements Draagbaar {

    private final String naam;
    private double hoogte;

    public Gebouw(String naam, double hoogte) {
        super();
        controleerNaam(naam);
        this.naam = naam;
        setHoogte(hoogte);
    }
    
    private void controleerNaam(String naam)
    {
       if (naam == null || naam.equals(""))
            throw new IllegalArgumentException
                ("Naam moet ingevuld worden!");
    }
    private void setHoogte(double hoogte) {
        if (hoogte < 3) {
            throw new IllegalArgumentException("De hoogte moet minstens 3m zijn!");
        }
        this.hoogte = hoogte;
    }

    public String getNaam() {
        return naam;
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public boolean isDraagbaar() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s met hoogte %.1f is %s.", naam, hoogte, isDraagbaar() ? "draagbaar" : "niet draagbaar");
    }

}
