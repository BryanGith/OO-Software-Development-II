package ui;

import domein.DomeinController;
import domein.Speler;
import domein.Wapen;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Oefening2a
{
    public Oefening2a(DomeinController dc)
    {
        
        String spelers[][]={{"50","elf","zwaard","stof"},
            {"200","trol","aks","blote handen"},
            {"120","tovenaar","vloek","onzichtbaar"}};
       
        dc.serialiseerObjectPerObject(spelers);
    }
}
