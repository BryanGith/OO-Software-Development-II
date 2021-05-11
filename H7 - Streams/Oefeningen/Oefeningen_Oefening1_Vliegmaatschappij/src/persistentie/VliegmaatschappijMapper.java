package persistentie;

import java.util.ArrayList;
import java.util.List;
import domein.Vliegmaatschappij;

public class VliegmaatschappijMapper {
	public List<Vliegmaatschappij> geefLijstVliegmijen()
    {
    	List<Vliegmaatschappij> airlines=new ArrayList<>();
    	
    	airlines.add(new Vliegmaatschappij(new String[]{"Delta","Air Canada","Aero Mexico","Ocean Air"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"United","Aria","Lufthansa","Ocean Air","Quantas","British Airways"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Northwest","Air Alaska","BMI","Avolar","EVA Air"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Canjet","Girjet"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Air Canada","Areo Mexico","Delta","Air Alaska"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Aero Mexico","Delta","Air Canda","British Airways"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Ocean Air","Delta","United","Quantas","Avolar"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Aria","United","Lufthansa"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Lufthansa","United","Aria","EVA Air"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Quantas","United","Ocean Air","AlohaAir"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"BMI","Northwest"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Maxair","Southwest","Girjet"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Girjet","Southwest","Canjet","Maxair"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"British Airways","United","Aero Mexico"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Air Alaska","Northwest","Air Canada"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Avolar","Northwest","Ocean Air"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"EVA Air","Northwest","Luftansa"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"Southwest","Girjet","Maxair"}));
    	airlines.add(new Vliegmaatschappij(new String[]{"AlohaAir","Quantas"}));
        return airlines;
    }
}
