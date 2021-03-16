package domein;

import exceptions.NegativeNumberException;

public class MijnGetal {
	private int getal;

	public MijnGetal(int getal) throws NegativeNumberException {
		setGetal(getal);
	}
	
	public int geefVierkantswortel() {
		return (int) Math.sqrt(getal);
	}

	public int getGetal() {
		return getal;
	}

	private void setGetal(int getal) throws NegativeNumberException {
		if (getal < 0) {
			throw new NegativeNumberException();
		}
		this.getal = getal;
	}
	
	

}
