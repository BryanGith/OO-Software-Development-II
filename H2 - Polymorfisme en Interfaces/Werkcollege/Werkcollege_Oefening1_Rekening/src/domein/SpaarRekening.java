package domein;

public class SpaarRekening extends Rekening {
	private static double aangroeiIntrest;

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
	}

	@Override
	public String geefCode() {
		return String.format("SR-%d-%.2f", getRekeningNr(), aangroeiIntrest);
	}

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public final static void setAangroeiIntrest(double aangroeiIntrest) {
		if (aangroeiIntrest < 0)
			throw new IllegalArgumentException("Intrest mag niet negatief zijn!");
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}

	@Override
	public boolean haalAf(double bedrag) {
		double saldo = getSaldo();
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
	public double geefJaarlijkseKost() {
		if (getSaldo() < 300) {
			return 0.05 * (300 - getSaldo());
		} else {
			return 0;
		}

	}
}
