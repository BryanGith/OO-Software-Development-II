package domein;

import exceptions.FormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vouwfiets extends Fiets {
    private String bijzonderheden;

    public Vouwfiets() throws FormatException {
        this(3, 20.3, "Nihil");
    }


    public Vouwfiets(int aantalVersnellingen, double maxSnelheid, String bijzonderheden) throws FormatException {
        super(aantalVersnellingen, maxSnelheid);
        controleerBijzonderheden(bijzonderheden);
        this.bijzonderheden = bijzonderheden;

    }

    private void controleerBijzonderheden(String bijzonderheden) throws FormatException {
        String regex = "[A-Z][a-z]{3,}( [a-z]+)*";
        Pattern patroon = Pattern.compile(regex);
        Matcher matcher = patroon.matcher(bijzonderheden);
        if (!matcher.matches())
            throw new FormatException("Bijzonderheden voldoen niet aan het formaat");
    }

    public boolean isPlooibaar() {
        return true;
    }

    @Override
    public void verhoogMaxSnelheid() {
        setMaxSnelheid(getMaxSnelheid() + 3);
    }

    @Override
    public String toString() {
        return String.format("%s, bijzonderheden: %s", super.toString(), bijzonderheden);
    }
}
