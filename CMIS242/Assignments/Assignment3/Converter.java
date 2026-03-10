/*	Russell Larkin
 * 	CMIS 242/7384
 * 	16 Apr 2023
 * 
 *  File Name : <assignment_3.java>
 * 
 *  Description : <This file contains overloaded constructors to deal with input/no input>
 *  
 */

public class Converter {
	
	private double inputData;

	//default constructor with no parameter
	public Converter() {
		inputData = Double.NaN;
	}

	//overloaded constructor
	public Converter(double inputData) {
		this.inputData = inputData;
	}

	//getters and setters for input
	public double getInput() {
		return inputData;
	}

	public void setInput(double inputData) {
		this.inputData = inputData;
	}
	
	//method to return input value
	double convert() {
		return inputData;
	}

}
