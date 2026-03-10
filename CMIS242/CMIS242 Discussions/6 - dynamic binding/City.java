/*	Russell Larkin
 * 	CMIS 242/7384
 * 	20 Apr 2023
 * 
 *  File Name : <City.java>
 * 
 *  Description : <Contains a City class for demonstrating dynamic binding>
 *  
 */

class City {
	
	private String city;

	public City(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void location() {
		System.out.println("You are near me in " + city +".");
	}
}