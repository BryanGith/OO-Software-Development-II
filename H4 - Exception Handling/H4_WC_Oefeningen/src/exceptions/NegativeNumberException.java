package exceptions;

public class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		super("Het getal mag niet negatief zijn!");
	}

	public NegativeNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}



}
