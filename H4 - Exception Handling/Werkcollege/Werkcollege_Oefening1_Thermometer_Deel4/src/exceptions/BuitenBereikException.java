package exceptions;

public class BuitenBereikException extends IllegalArgumentException {

	public BuitenBereikException() {
		super("De ingevulde waarde ligt niet in het bereik!");
	}

	public BuitenBereikException(String msg) {
		super(msg);
	}

	public BuitenBereikException(Throwable cause) {
		super(cause);
	}

	public BuitenBereikException(String message, Throwable cause) {
		super(message, cause);
	}

}
