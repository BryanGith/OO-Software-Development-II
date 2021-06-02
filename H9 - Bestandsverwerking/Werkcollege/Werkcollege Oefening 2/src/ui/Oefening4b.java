package ui;

import domein.DomeinController;
import domein.Speler;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Oefening4b
{
    public Oefening4b(DomeinController dc)
    {
        System.out.println(Arrays.toString(dc.deSerialiseerVolledigeLijst("oef2b.ser")));
    }
}
