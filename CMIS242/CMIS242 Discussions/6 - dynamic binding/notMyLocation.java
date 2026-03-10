/*	Russell Larkin
 * 	CMIS 242/7384
 * 	20 Apr 2023
 * 
 *  File Name : <notMyLocation.java>
 * 
 *  Description : <This file demonstrates dynamic binding by extending the City class>
 *  
 */

public class notMyLocation extends City {
	
	public notMyLocation(String city) {
		super(city);
	}

	@Override
	public void location() {
		System.out.println("You are not near me. You are in " + getCity() + ".");
	}
}
