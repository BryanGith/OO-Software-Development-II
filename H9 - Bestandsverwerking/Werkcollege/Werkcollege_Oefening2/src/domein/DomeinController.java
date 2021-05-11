package domein;

import java.util.List;

public class DomeinController
{
    private final SpelerRepository spelerRepo;

    public DomeinController()
    {
        spelerRepo = new SpelerRepository();
    }

	public void serialiseerObjectPerObject(String[][] spelers)
	{
		spelerRepo.serialiseerObjectPerObject(spelers);
	}

	public void serialiseerVolledigeLijst(String[][] spelers)
	{
		spelerRepo.serialiseerVolledigeLijst(spelers);
	}

	public void schrijfNaarTekstBestand(String[][] spelers)
	{
		spelerRepo.schrijfNaarTekstBestand(spelers);
	}

	public String[] deSerialiseerObjectPerObject(String bestandsnaam)
	{
		return zetOmNaarTekst(spelerRepo.deSerialiseerObjectPerObject(bestandsnaam));
	}

	public String[] deSerialiseerVolledigeLijst(String bestandsnaam)
	{
		return zetOmNaarTekst(spelerRepo.deSerialiseerVolledigeLijst(bestandsnaam));
	}

	public String[] leesTekstBestand(String bestandsnaam)
	{
		return zetOmNaarTekst(spelerRepo.leesTekstBestand(bestandsnaam));
	}

    private String[] zetOmNaarTekst(List<Speler> lijst)
    {
    	return lijst.stream().map(Speler::toString).toArray(String[]::new);
    }
}
