/*	Russell Larkin
 * 	CMIS 242/7384
 * 	15 Apr 2023
 * 
 *  File Name : <Mansion.java>
 * 
 *  Description : <Subclass for creating a Mansion. >
 *  
 */

public class Mansion extends Residence{
	
	//three private attributes specific to Mansion.java
	private boolean swimmingPool;
	private boolean gatedCommunity;
	private String streetName;
	
	//constructor adding three attributes
	public Mansion(int numberOfDoors, String floorType, int bathroom, int bedroom, boolean swimmingPool,
			boolean gatedCommunity, String streetName) {
		super(numberOfDoors, floorType, bathroom, bedroom);
		this.swimmingPool = swimmingPool;
		this.gatedCommunity = gatedCommunity;
		this.streetName = streetName;
	}

	//getters and setters
	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public boolean isGatedCommunity() {
		return gatedCommunity;
	}

	public void setGatedCommunity(boolean gatedCommunity) {
		this.gatedCommunity = gatedCommunity;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}	
	
	public String toString() {
		return "- Mansion - \nNumber of doors: " + this.getNumberOfDoors() + "\nFloor type: " + this.getFloorType() + 
				"\nBathrooms: " + this.getBathroom() + "\nBedrooms: " + this.getBedroom() + "\nSwimming pool: " + this.isSwimmingPool() + "\nGated community: "
				+ this.isGatedCommunity() + "\nSounds: " + this.getSounds();
	}

}
