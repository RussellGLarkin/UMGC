package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <EBook.java>
 * 
 *  Description : <EBook class that contains constructor for EBook with local attribute numChapters. 
 *  				Overridden rental fee and toString>
 *  
 */

import java.util.Calendar;

public class EBook extends Media {
	private int numChapters;
	
	public EBook(int id, String title, int year, int numChapters, boolean isAvailable) {
		super(id, title, year, isAvailable);
		this.numChapters = numChapters;
	}
	
	public int getChapters() {
		return numChapters;
	}
	
	public void setChapters(int numChapters) {
		this.numChapters = numChapters;
	}
	
	@Override
	public double calculateRentalFee() {
		double fee = numChapters * 0.10; //basic fee
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(this.getYear() == currentYear) {
			fee += 1.00; // add $1.00 fee
		}
		
		return fee;
	}
	
	@Override
	public String toString() {
		return "EBook [ " + super.toString() + ", chapters=" + numChapters + 
				", available=" + isAvailable() + "]";
	}
}