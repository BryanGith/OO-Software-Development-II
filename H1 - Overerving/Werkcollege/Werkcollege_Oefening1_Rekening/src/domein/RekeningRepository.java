package domein;

import java.util.List;
import persistentie.RekeningMapper;

public class RekeningRepository 
{
	private final List<Rekening> rekeningen;
	private final RekeningMapper rm;
	
	public RekeningRepository() 
	{
		rm = new RekeningMapper(); // niet vergeten!!!
		rekeningen = rm.geefRekeningen();
	}

	public List<Rekening> geefGewijzigdeRekeningen() 
	{
		for (Rekening r: rekeningen)
		{
			if (r instanceof SpaarRekening)
			{
				// intrest toevoegen!
				double verhoging = 
					r.getSaldo() * SpaarRekening.getAangroeiIntrest() / 100;
				r.stortOp(verhoging);
			}
			else // automatisch een ZichtRekening!
			{
				// maxKrediet met 10 verminderen
				ZichtRekening zr = (ZichtRekening) r;
				zr.setMaxKredietOnderNul(zr.getMaxKredietOnderNul() - 10);
			}
		}
		return rekeningen;
	}
}