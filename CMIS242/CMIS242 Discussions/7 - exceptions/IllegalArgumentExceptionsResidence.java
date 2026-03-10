public class IllegalArgumentExceptionsResidence extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public IllegalArgumentExceptionsResidence(String floorType) {
			msg = "FloorType cannot be empty or blank.";
	}
	

	public IllegalArgumentExceptionsResidence(int numberOf) {
		if (numberOf == 1) {
			msg = "Number of doors needs to be greater than 0.";
		} else if (numberOf == 2) {
			msg = "Number of bathrooms needs to be greater than 0.";
		} else if (numberOf == 3) {
			msg = "Number of bedrooms needs to be greater than 0.";
		}
		
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " : " + msg + "\n\n----------------------------------------------\n";
	}
}