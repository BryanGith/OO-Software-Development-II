package domein;

import java.util.ArrayList;
import java.util.List;


public class VoorwerpRepository
{
    private final List<Voorwerp> collectie;

    public VoorwerpRepository()
    {
        collectie = new ArrayList<>();
    }

    public void voegVoorwerpToe(Voorwerp voorwerp)
    {
        collectie.add(voorwerp);
    }

    public String geefOverzicht()
    {
        if (collectie.isEmpty())
        {
            return String.format("collectie is leeg");
        }

        String resul = "";
        for (Voorwerp eenVoorwerp : collectie)
        {
            resul += String.format("%s%n",eenVoorwerp);
        }
        return resul;
    }

}
