public class ResidenceTest {

	public static void main(String[] args) {
			
		try {
			RV travelTrailer = new RV (1, "Laminate", 1, 2, 2);
			System.out.println(travelTrailer);
			travelTrailer.residenceFoundation();
			System.out.println("\n----------------------------------------------\n");
		} catch (IllegalArgumentExceptionsResidence e) {
			System.out.println(e.toString());
		} catch (InvalidWheelNumberException e) {
			System.out.println(e.getMessage());
		}
		
		try {	
			RV travelTrailerError = new RV (1, "Laminate", 0, 2, 4);
			System.out.println(travelTrailerError);
			travelTrailerError.residenceFoundation();
			System.out.println("\n----------------------------------------------\n");
		} catch (IllegalArgumentExceptionsResidence e) {
			System.out.println(e.toString());
		} catch (InvalidWheelNumberException e) {
			System.out.println(e.toString());
		}
		
		try {
			Mansion wishfulThinking = new Mansion (4, "Marble", 10, 7, true, true, "Bougie Drive");
			System.out.println((wishfulThinking));
			wishfulThinking.residenceFoundation();
			System.out.println("\n----------------------------------------------\n");
		} catch (IllegalArgumentExceptionsResidence e) {
				System.out.println(e.toString());
		} 
		
		try {	
			RV travelTrailerError2 = new RV (1, "", 1, 2, 4);
			System.out.println(travelTrailerError2);
			travelTrailerError2.residenceFoundation();
			System.out.println("\n----------------------------------------------\n");
		} catch (IllegalArgumentExceptionsResidence e) {
			System.out.println(e.toString());
		} catch (InvalidWheelNumberException e) {
			System.out.println(e.toString());
		}
		
		try {
			RV travelTrailer1 = new RV (1,"Wood", 1, 2, 4, "Child snoring");
			System.out.println(travelTrailer1);
			travelTrailer1.residenceFoundation();
			System.out.println("\n----------------------------------------------\n");
		} catch (IllegalArgumentExceptionsResidence e) {
				System.out.println(e.toString());
		} catch (InvalidWheelNumberException e) {
			System.out.println(e.toString());
		}
	}
}
