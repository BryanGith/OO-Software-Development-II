package domein;

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
	
	public boolean isPalindroom() {
		int indexVooraan = 0;
		int indexAchteraan = inhoud.length()-1;
		
		while (indexVooraan < indexAchteraan) {
			if (inhoud.charAt(indexVooraan) != inhoud.charAt(indexAchteraan)) {
				return false;
			}
			indexVooraan++;
			indexAchteraan--;
		}
		return true;
	}

}
