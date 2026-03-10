/*	Russell Larkin
 * 	CMIS 242/7384
 * 	16 Apr 2023
 * 
 *  File Name : <assignment_3.java>
 * 
 *  Description : <This file converts temperatures from F to C>
 *  
 */

public class TemperatureConverter extends Converter {
	
	public TemperatureConverter(double fahrenheitTemperature) {
		super(fahrenheitTemperature);
	}
	
	@Override
	double convert() {
		if(super.getInput() == Double.NaN) {
			return Double.NaN;
		} else {
		double celsius = ((super.getInput() - 32) * 5) / 9;
		return celsius;
		}
	}
}
