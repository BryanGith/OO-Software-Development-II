package domein;

public class SpaarRekening extends Rekening {
	// extra attribuut
	private static double aangroeiIntrest;

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
	}

	// getter en setter voor attribuut
	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public final static void setAangroeiIntrest(double aangroeiIntrest) {
		if (aangroeiIntrest < 0)
			throw new IllegalArgumentException("Intrest mag niet negatief zijn!");
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}

	// extra (overriden) methodes
	@Override
	public boolean haalAf(double bedrag) {
		double saldo = /* super. */getSaldo();
		if (bedrag <= saldo)
			return super.haalAf(bedrag);
		else
			return false;
	}

	@Override
	public String toString() {
		return String.format("%s. Aangroeiintrest = %.2f%%", super.toString(), aangroeiIntrest);
	}

	@Override
	public String geefCode() {
		return String.format("SR-%d-%.2f", super.getRekeningNr(), aangroeiIntrest);
	}
}
