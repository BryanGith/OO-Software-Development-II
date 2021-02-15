package persistentie;

import java.util.*;
import domein.*;

public class RekeningMapper 
{
	// Haal de rekeningen uit de tabel Rekening van de database
	public List<Rekening> geefRekeningen()
	{
		List<Rekening> lijst = new ArrayList<>();
		
		SpaarRekening s1, s2;
		ZichtRekening z1, z2;
		
		s1 = new SpaarRekening(101L, "Maxime");
		s2 = new SpaarRekening(202L, "Ruben");
		z1 = new ZichtRekening(303L, "Nick", -50);
		z2 = new ZichtRekening(404L, "Alexander", -3286);
		
		s1.stortOp(100);
		s2.stortOp(200);
		z1.stortOp(300);
		z2.stortOp(400);
		SpaarRekening.setAangroeiIntrest(5);
		
		lijst.add(s2);
		lijst.add(z1);
		lijst.add(z2);
		lijst.add(s1);
		
		return lijst;
	}
}
