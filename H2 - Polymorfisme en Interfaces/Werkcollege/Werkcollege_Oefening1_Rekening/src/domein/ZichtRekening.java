package domein;

public class ZichtRekening extends Rekening {
	private double maxKredietOnderNul;

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}

	@Override
	public String geefCode() {
		return String.format("ZR-%.2f-%d", Math.abs(maxKredietOnderNul), getRekeningNr());
	}

	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if (maxKredietOnderNul > 0 || maxKredietOnderNul > super.getSaldo())
			throw new IllegalArgumentException(
					"Max krediet moet negatief " + "zijn en lager dan of gelijk aan het saldo");
		this.maxKredietOnderNul = maxKredietOnderNul;
	}

	@Override
	public boolean haalAf(double bedrag) {
		double saldo = getSaldo();
		if (saldo - bedrag >= maxKredietOnderNul)
			return super.haalAf(bedrag);
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s. Max krediet onder nul = %.2f", super.toString(), maxKredietOnderNul);
	}

	@Override
	public double geefJaarlijkseKost() {
		return 0.01 * getMaxKredietOnderNul();
	}
}
