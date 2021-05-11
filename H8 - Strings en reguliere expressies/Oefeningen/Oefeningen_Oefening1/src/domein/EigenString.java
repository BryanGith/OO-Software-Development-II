package domein;

public class EigenString {
	private String tekst;

	public EigenString(String tekst) {
		setTekst(tekst);
	}

	public String getTekst() {
		return tekst;
	}

	public final void setTekst(String tekst) {
		if (tekst == null || tekst.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.tekst = tekst;
	}

	public void vergroot() {
		StringBuilder resultaat = new StringBuilder("   ");
		resultaat.append(tekst);
		resultaat.append("  ");

		setTekst(resultaat.toString());

	}

	public int verklein() {
		int spaties = 0;
		for (int i = 0; i < tekst.length(); i++) {
			if (tekst.charAt(i) == ' ') {
				spaties++;
			}

		}
		setTekst(tekst.replace(" ", ""));
		
		return spaties;

	}
}
