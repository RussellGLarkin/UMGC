package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <Manager.java>
 * 
 *  Description : <Manager file to load all files from a directory into an ArrayList, 
 *  				search for files within that ArrayList, and rent files from that ArrayList
 *  				if available.>
 *  
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager
{
	//attributes
	private List<Media> media;
	private int Id;
	
	public Manager(){
		media = new ArrayList<Media>();
		Id = 123; // first id tag
	}
	
	// loads media from file
	public void loadData(String fname){
		File dataFile = new File(fname);
		
		try {
			Scanner fileScanner = new Scanner(dataFile);
			
			while(fileScanner.hasNextLine()) {
				String[] fields = fileScanner.nextLine().trim().split("\\,");
				
				switch(fields[0].charAt(0)){
				
					case 'B':
						media.add(new EBook(Id++, fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Boolean.parseBoolean(fields[4])));
						break;
					case 'C':
						media.add(new MusicCD(Id++, fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Boolean.parseBoolean(fields[4])));
						break;
					case 'D':
						media.add(new MovieDVD(Id++, fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]), Boolean.parseBoolean(fields[4])));
						break;
					default:
						System.out.printf("Invalid media type: %s, %s, %s, %s\n", fields[0], fields[1], fields[2], fields[3]);
				}
			}
			fileScanner.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	// find media in file
	public List<Media> findItems(String searchTitle){
		List<Media> selectedMedia = new ArrayList<Media>();
		for (Media item : media) {
			if (item.getTitle().equals(searchTitle))
				selectedMedia.add(item);
		}
		return selectedMedia;
		
	}
	
	// rent media from file
	public Media rentItem(int id){
		for (Media item : media) {
			if (item.getId() == id && item.isAvailable()) {
				item.setRented();
				return item;
			}
		}
		return null;
	}
}
