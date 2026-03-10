/*	Russell Larkin
 * 	CMIS 242/7384
 * 	20 Apr 2023
 * 
 *  File Name : <DynamicBindingTest.java>
 * 
 *  Description : <This file demonstrates dynamic binding by using a City class and its subclass notMyLocation>
 *  
 */

public class DynamicBindingTest {

	public static void main(String[] args) {
	
	String thisCity = "Chicago";
	City isCity;

	if (thisCity.equals("Chicago")) {
		isCity = new City(thisCity);
	} else {
		isCity = new notMyLocation(thisCity);
	}
	
	isCity.location();
	}
}