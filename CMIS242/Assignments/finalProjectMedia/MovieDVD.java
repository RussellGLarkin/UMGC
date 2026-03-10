package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <MusicCD.java>
 * 
 *  Description : <MovieDVD class that contains constructor for MovieDVD with local attribute size. 
 *  				Overridden rental fee and toString>
 *  
 */

public class MovieDVD extends Media {
	
	//attributes
	private double size;
	
	//Constructors
	public MovieDVD(int id, String title, int year, double size, boolean isAvailable) {
		super(id, title, year, isAvailable);
		this.size = size;
	}
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "MovieDVD [ " + super.toString() + ", size=" + size + 
				", available=" + isAvailable() + "]";
	}
    
	@Override
	public double calculateRentalFee() {
		return super.calculateRentalFee();
	}
}