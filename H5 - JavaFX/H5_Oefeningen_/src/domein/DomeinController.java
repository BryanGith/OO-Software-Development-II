/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;


/**
 *
 * @author sv964
 */
public class DomeinController
{
    private final VoorwerpRepository voorwerpRepo;

    public DomeinController()
    {
        voorwerpRepo = new VoorwerpRepository();
    }
    
    public void voegWapenToe(String naam, double gewicht,
            int niveau, int kracht, boolean gebruikt)
    {
        Voorwerp wapen = new Wapen(naam,gewicht,niveau,kracht,gebruikt);
        voorwerpRepo.voegVoorwerpToe(wapen);
    }
    
     public void voegSleutelToe(String naam, double gewicht,
            int niveau, int deur)
     {
         Voorwerp sleutel = new Sleutel(naam,gewicht,niveau, deur);
         voorwerpRepo.voegVoorwerpToe(sleutel);
     }
     
     public String toonOverzicht()
     {
         return voorwerpRepo.toonOverzicht();
     }
    
    
}
