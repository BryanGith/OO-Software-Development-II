package exceptions;

public class TeGroteBestellingException extends Exception {

	public TeGroteBestellingException() {
		super("Deze bestelling is te groot! Je bestelling kan maximaal 8 producten bevatten.");
	}

	public TeGroteBestellingException(String message) {
		super(message);
	}

}
