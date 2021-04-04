package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OefFruit1_opgave {
    public static void main(String args[]) {
        String arX[] = {"appel", "peer", "citroen", "kiwi"},
               arY[] = {"banaan", "mango", "citroen", "kiwi", "zespri"};

       /* Behandel arX en arY als collections en maak gebruik van de bulkoperaties om volgende output te leveren:
		In y zit extra [banaan, mango, zespri]
		In x zit extra [appel, peer]
		x en y hebben gemeenschappelijk [citroen, kiwi] */
        
        List<String> x, y;
        x = Arrays.asList(arX);
        y = Arrays.asList(arY);
        
        List<String> extraY, extraX, gemeenschappelijk;
        
        extraY = new ArrayList<>(y);
        extraY.removeAll(x);
        System.out.printf("In y zit extra %s%n", extraY);
        
        extraX = new ArrayList<>(x);
        extraX.removeAll(y);
        System.out.printf("In x zit extra %s%n", extraX);
        
        gemeenschappelijk = new ArrayList<>(y); //kopieer 1 vd 2 oorspronkelijke lijsten
        gemeenschappelijk.retainAll(x); // hou alleen de elementen over die ook in de andere lijst zitten
        System.out.printf("x en y hebben gemeenschappelijk %s%n", gemeenschappelijk);
        
        
    }
}
