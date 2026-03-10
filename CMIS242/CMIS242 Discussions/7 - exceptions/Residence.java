/*	Russell Larkin
 * 	CMIS 242/7384
 * 	15 Apr 2023
 * 
 *  File Name : <Residence.java>
 * 
 *  Description : <Superclass for creating a residence. >
 *  
 */

public class Residence {
	
	private int numberOf = 0;
			
	//private attributes
	private int numberOfDoors;
	private String floorType;
	private int bathroom;
	private int bedroom;
	private String sounds = "Birds chirping, wind blowing.";
	
	//constructor initializing numberOfDoors, floorType, bathroom, bedroom
	public Residence(int numberOfDoors, String floorType, int bathroom, int bedroom) {
		if (numberOfDoors <= 0 || bathroom <= 0 || bedroom <= 0) {
			if (numberOfDoors <= 0) {
				numberOf = 1;
			} else if (bathroom <= 0) {
				numberOf = 2;
			} else if (bedroom <= 0) {
				numberOf = 3;
			}
			throw new IllegalArgumentExceptionsResidence(numberOf);
		}
		if (floorType == null || floorType.isEmpty()) {
			throw new IllegalArgumentExceptionsResidence(floorType);
		}
		
		this.numberOfDoors = numberOfDoors;
		this.floorType = floorType;
		this.bathroom = bathroom;
		this.bedroom = bedroom;
	}

	//getters and setters
	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getSounds() {
		return sounds;
	}

	public void setSounds(String sounds) {
		this.sounds = sounds;
	}
	
	public void residenceFoundation () {
		System.out.println("Residences are built on reinforced concrete");
	}
	
}
