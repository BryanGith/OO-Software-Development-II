package domein;

import java.util.List;

public class DomeinController 
{
	private final RekeningRepository rr;
	
	public DomeinController() 
	{
		rr = new RekeningRepository();
	}

	public String geefRekeningen() 
	{
		// zet lijst van Rekeningen om in een String
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r/*.toString()*/);
		return uitvoer;
	}
	
	public String geefCodes() 
	{
		// Zet lijst van Rekeningen om in een String met hun codes 
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r.geefCode());
		return uitvoer;
	}

}
