package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <MusicCD.java>
 * 
 *  Description : <MusicCD class that contains constructor for MusicCD with local attribute length. 
 *  				Overridden rental fee and toString>
 *  
 */

import java.util.Calendar;

public class MusicCD extends Media {
	private int length;
	
	public MusicCD(int id, String title, int year, int length, boolean isAvailable) {
		super(id, title, year, isAvailable);
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "MusicCD [ " + super.toString() + ", length=" + length + 
				", available=" + isAvailable() + "]";
	}
	
	@Override
	public double calculateRentalFee() {
		double fee = length * 0.02; // basic Fee
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(this.getYear() == currentYear) {
			fee += 1.00; // add $1.00 to the fee
		}
		
		return fee;
	}
}