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
			return inhoud.charAt(lengte / 2);
		} else {
			throw new IllegalArgumentException("Inhoud moet een oneven aantal karakters hebben!");
		}
	}

	public String keerOm() {
		StringBuilder sb = new StringBuilder(inhoud);
		return sb.reverse().toString();

	}

	public boolean isPalindroom() {
		return inhoud.equals(keerOm());
	}

	public String maakWartaal(char oud, char nieuw) {
		char oudKlein, oudGroot, nieuwKlein, nieuwGroot;
		oudKlein = Character.toLowerCase(oud);
		oudGroot = Character.toUpperCase(oud);
		nieuwKlein = Character.toLowerCase(nieuw);
		nieuwGroot = Character.toUpperCase(nieuw);

//		String wartaal = "";
//		for (char kar : inhoud.toCharArray()) {
//			if (kar == oudKlein) {
//				wartaal += nieuwKlein;
//			} else {
//				if (kar == oudGroot) {
//					wartaal += nieuwGroot;
//				} else {
//					wartaal += kar;
//				}
//			}
//		}
//		return wartaal;

//		// Met Stringbuildere
//		StringBuilder sBuilder = new StringBuilder(inhoud);
//		for (int i = 0; i < sBuilder.length(); i++) {
//			if (sBuilder.charAt(i) == oudKlein) {
//				sBuilder.setCharAt(i, nieuwKlein);
//			} else {
//				if (sBuilder.charAt(i) == oudGroot) {
//					sBuilder.setCharAt(i, nieuwGroot);
//				}
//			}
//		}
//		return sBuilder.toString();
		
		String vervangKlein = inhoud.replaceAll("[" + oudKlein + "]", String.valueOf(nieuwKlein));
		String vervangGroot = vervangKlein.replaceAll("[" + oudGroot + "]", String.valueOf(nieuwGroot));
		return vervangGroot;


	}

}
