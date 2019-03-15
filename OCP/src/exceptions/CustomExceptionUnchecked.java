package exceptions;

public class CustomExceptionUnchecked extends RuntimeException{

	public CustomExceptionUnchecked() {
		
	}	
	
	// Takes in an exception to wrap with the custom exception
	public CustomExceptionUnchecked(Exception e) {
		super(e);
	}	
	
	// Takes in a string to show as an error message
	public CustomExceptionUnchecked(String message) {
		super(message);
	}
}
