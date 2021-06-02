package exceptions;

public class NegatiefException extends IllegalArgumentException {
    public NegatiefException() {
        super("Moet positief zijn.");
    }

    public NegatiefException(String message) {
        super(message);
    }

}
