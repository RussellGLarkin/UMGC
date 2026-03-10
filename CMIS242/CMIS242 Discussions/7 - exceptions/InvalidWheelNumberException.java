public class InvalidWheelNumberException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidWheelNumberException() {
		super("InvalidWheelNumberException: Number of wheels cannot be less than four.");
	}
}