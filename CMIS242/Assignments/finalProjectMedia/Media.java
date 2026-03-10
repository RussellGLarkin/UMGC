package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <Media.java>
 * 
 *  Description : <Abstract class to represent a generic media>
 *  
 */

public abstract class Media {
	private int id;
	private String title;
	private int year;
	private boolean isAvailable;
	
	//Constructor
	public Media(int id, String title, int year, boolean isAvailable) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable() {
		this.isAvailable = true;
	}
	
	public void setRented() { 
		this.isAvailable = false; 
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", title=" + getTitle() + ", year=" + year;
		}
	
	public double calculateRentalFee() {
		return 3.50;
	}
}