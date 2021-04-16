package domein;

import java.util.List;
import persistentie.RekeningMapper;

public class RekeningRepository {
	private final List<Rekening> rekeningen;
	private final RekeningMapper rm;

	public RekeningRepository() {
		rm = new RekeningMapper();
		rekeningen = rm.geefRekeningen();
	}

	public List<Rekening> geefGewijzigdeRekeningen() {
		for (Rekening rekening : rekeningen) {
			if (rekening instanceof SpaarRekening) {
				double verhoging = rekening.getSaldo() * SpaarRekening.getAangroeiIntrest() / 100;
				rekening.stortOp(verhoging);
			} else {
				ZichtRekening zr = (ZichtRekening) rekening;
				zr.setMaxKredietOnderNul(zr.getMaxKredietOnderNul() - 10);
			}
		}
		return rekeningen;
	}
}