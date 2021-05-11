package ui;

import domein.MijnString;

public class ApplicatieMiddelsteKarakter
{
    public static void main(String[] args)
    {
        String woord = "hottentottententoonstelling";
        
        MijnString object = new MijnString(woord);
               
        System.out.printf("Middelste letter = %s%n", object.bepaalMiddelsteKar());
    }
}
