package custom_exceptions;

public class IncompleteBuildException extends RuntimeException {

	public IncompleteBuildException(String string) {
		super(string);
	}

}
