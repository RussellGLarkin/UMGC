/*	Russell Larkin
 * 	CMIS 242/7384
 * 	09 Mar 2023
 * 
 * File Name : <WashingMachine.java>
 * 
 * Description : <This file contains a class that will contain the attributes and methods that support a washing machine object>
 *
 */

public class WashingMachine {
	
	//instance variables
	private String model;
	private String typeLoad;
	private double capacity;

	//constructor
	public WashingMachine(String model, String typeLoad, double capacity) {
		this.model = model;
		this.typeLoad = typeLoad;
		this.capacity = capacity;
	}
	
	// toString method
	public String toString() {
		return ("Model=" + model + ". Load=" + typeLoad + " loader. Capacity=" + capacity + " Kgs.");
	}
	
}
