package custom_exceptions;

public class NotEnoughtCreditException extends RuntimeException {

	public NotEnoughtCreditException(String string) {
		super(string);
	}

}
