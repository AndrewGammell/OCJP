package exceptions;

public class CustomExceptionChecked extends Exception{

	public CustomExceptionChecked() {

	}

	// Takes in an exception to wrap with the custom exception
	public CustomExceptionChecked(Exception e) {
		super(e);
	}

	// Takes in a string to show as an error message
	public CustomExceptionChecked(String message) {
		super(message);
	}
}
