/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sv964
 */
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

    public String toonOverzicht()
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
