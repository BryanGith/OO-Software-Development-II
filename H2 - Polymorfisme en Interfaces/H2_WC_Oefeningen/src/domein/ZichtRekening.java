package domein;

public class ZichtRekening extends Rekening {
	// extra attribuut
	private double maxKredietOnderNul;

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}

	@Override
	public String geefCode() {
		return String.format("ZR-%.2f-%d", Math.abs(maxKredietOnderNul), getRekeningNr());
	}

	// getter en setter voor attribuut
	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if (maxKredietOnderNul > 0 || maxKredietOnderNul > super.getSaldo())
			throw new IllegalArgumentException(
					"Max krediet moet negatief " + "zijn en lager dan of gelijk aan het saldo");
		this.maxKredietOnderNul = maxKredietOnderNul;
	}

	// extra (overridden) methodes
	@Override
	public boolean haalAf(double bedrag) {
		double saldo = getSaldo();
		if (saldo - bedrag >= maxKredietOnderNul)
			return super.haalAf(bedrag);
		// else
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s. Max krediet onder nul = %.2f", super.toString(), maxKredietOnderNul);
	}

	@Override
	public double geefJaarlijkseKost() {
		return Math.abs(maxKredietOnderNul) * 0.01;
	}
}
