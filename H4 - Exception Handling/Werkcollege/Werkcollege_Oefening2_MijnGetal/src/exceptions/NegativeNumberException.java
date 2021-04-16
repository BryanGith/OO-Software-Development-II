package exceptions;

public class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		super("Geef een positief getal in!");
	}

	public NegativeNumberException(String message) {
		super(message);
	}

}
