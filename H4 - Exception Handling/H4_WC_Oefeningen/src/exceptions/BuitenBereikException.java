package exceptions;

public class BuitenBereikException extends IllegalArgumentException {

	public BuitenBereikException() {
		super("Waarde ligt buiten het bereik");
	}

	public BuitenBereikException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public BuitenBereikException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BuitenBereikException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
