package domein;

import java.util.Iterator;


public class MijnString {
	private String inhoud;

	public String getInhoud() {
		return inhoud;
	}

	public void setInhoud(String inhoud) {
		if (inhoud == null || inhoud.isBlank()) {
			throw new IllegalArgumentException("Inhoud mag niet leeg zijn!");
		}
		this.inhoud = inhoud;
	}

	public MijnString(String inhoud) {
		setInhoud(inhoud);
	}

	public char bepaalMiddelsteKar() {
		int lengte = inhoud.length();
		if (lengte % 2 != 0) {
			return inhoud.charAt(lengte/2);
		} else {
			throw new IllegalArgumentException("Inhoud moet een oneven aantal karakters hebben!");
		}
	}

	public String keerOm() {
		// Met charArray
//		String omgekeerd = "";
//		for (char kar : inhoud.toCharArray()) {
//			omgekeerd = kar + omgekeerd;
//		}
//		return omgekeerd;
		
		// Met StringBuilder
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < inhoud.length(); i++) {
//			sb.insert(0, inhoud.charAt(i));
//		}
		StringBuilder sb = new StringBuilder(inhoud);
		return sb.reverse().toString();
			
	}
	
	public boolean isPalindroom() {
		return inhoud.equals(keerOm());
	}

}
