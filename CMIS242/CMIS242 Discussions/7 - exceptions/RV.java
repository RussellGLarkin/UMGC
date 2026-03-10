/*	Russell Larkin
 * 	CMIS 242/7384
 * 	15 Apr 2023
 * 
 *  File Name : <RV.java>
 * 
 *  Description : <Subclass for creating a RV. >
 *  
 */

public class RV extends Residence {

	//added private attributes specific to RV.java
	private int numberOfWheels;
	private String sounds = "Wind blowing."; //default sound
	

	//constructor adding attribute
	public RV(int numberOfDoors, String floorType, int bathroom, int bedroom, int numberOfWheels) {
		super(numberOfDoors, floorType, bathroom, bedroom);
		if(numberOfWheels < 4) {
			throw new InvalidWheelNumberException();
		}
		this.numberOfWheels = numberOfWheels;
	}
	
	//overload 
	public RV(int numberOfDoors, String floorType, int bathroom, int bedroom, int numberOfWheels, String sounds) {
		super(numberOfDoors, floorType, bathroom, bedroom);
		if(numberOfWheels < 4) {
			throw new InvalidWheelNumberException();
		}
		this.numberOfWheels = numberOfWheels;
		this.sounds = sounds;
	}

	//getters and setters
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getSounds() {
		return sounds;
	}
	
	public String toString() {
		return "- " + this.getNumberOfWheels() + " wheeled RV  - \nNumber of doors: " + this.getNumberOfDoors() + "\nFloor type: " + this.getFloorType() + "\nBathrooms: " 
	+ this.getBathroom() + "\nBedrooms: " + this.getBedroom() + "\nSounds = " + this.getSounds();
	}
	
	@Override
	public void residenceFoundation () {
		System.out.println("Recreational Vehicles are built on " + this.getNumberOfWheels() + " wheels and a steel chassis.");
	}
}
