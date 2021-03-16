package exceptions;

public class TeGroteBestellingException extends Exception {

	public TeGroteBestellingException() {
		this("Maximaal aantal te bestellen artikelen is 8!");
	}

	public TeGroteBestellingException(String message) {
		super(message);
	}

}
