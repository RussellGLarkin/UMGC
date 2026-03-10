/*	Russell Larkin
 * 	CMIS 242/7384
 * 	16 Apr 2023
 * 
 *  File Name : <assignment_3.java>
 * 
 *  Description : <This file converts distance in miles to kilometers>
 *  
 */

public class DistanceConverter extends Converter {

	public DistanceConverter (double distanceInMiles) {
		super(distanceInMiles);
	}
	
	@Override
	double convert() {
		if (super.getInput() == Double.NaN) {
			return Double.NaN;
		} else {
			double distanceInKilometers = super.getInput() * 1.609;
			return distanceInKilometers;
 		}
	}

}
