package Assignment1;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	26 Mar 2023
 * 
 *  File Name : <Weight.java>
 * 
 *  Description : <This file contains the attributes and methods that support finding maximum, minimum and average weights>
 *  
 */

public class Weight {
	
	//private attributes
	private final int OUNCES_IN_A_POUND = 16;
	private int pounds;
	private double ounces;
	
	//constructor initializing pounds and ounces
	public Weight(int pounds, double ounces) {
		this.pounds = pounds;
		this.ounces = ounces;
		normalize(); 	// will normalize if ounces > OUNCES_IN_A_POUND
	}
	
	//did not use, but had you have made it public I would have!
	// private double toOunces() {
	// 	return (pounds * OUNCES_IN_A_POUND) + ounces;
	// }
	
	//increment pounds while ounces are more than OUNCES_IN_A_POUND
	private void normalize() {
		while (ounces > OUNCES_IN_A_POUND) {
			ounces = ounces - OUNCES_IN_A_POUND;
			pounds++;
		}
	}
	
	//determines if the object is greater or less than the initialized values
	public boolean lessThan (Weight weight) {
		if(this.pounds < weight.pounds)
			return true;
		else if (this.pounds > weight.pounds)
			return false;
		else {
			if(this.ounces < weight.ounces)
				return true;
			else {
				return false;
			}
		}
	}
	
	//adds the object's weight values to the initialized values
	public void addTo (Weight weight) {
		
		this.pounds = this.pounds + weight.pounds;
		this.ounces = this.ounces + weight.ounces;
		normalize(); 	// will normalize if ounces > OUNCES_IN_A_POUND
	}
	
	//formatted toString returning pounds (as many integers as needed) and ounces (2 decimal places) 
	public String toString() {
		return String.format("%d pounds and %.2f ounces", pounds, ounces);
	}
}
