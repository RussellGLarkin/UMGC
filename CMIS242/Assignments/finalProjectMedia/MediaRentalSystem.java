package finalProjectMedia;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <MediaRentalSystem.java>
 * 
 *  Description : <GUI to run the rental system program>
 *  
 */

import javax.swing.*;
import java.io.File;
import java.util.List;

import static javax.swing.JOptionPane.*;

public class MediaRentalSystem {
	private Manager manager;
	
	private void go() {
		manager = new Manager();
		GUI();
	}    
	
	//create GUI
	private void GUI() {
		JFrame frame = new JFrame("Welcome to Media Rental System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		
		//create menu
		JMenu menu = new JMenu("Menu");
			JMenuItem menuItem1 = new JMenuItem("Load Media objects...");
			JMenuItem menuItem2 = new JMenuItem("Find Media object...");
			JMenuItem menuItem3 = new JMenuItem("Rent Media object...");
			JSeparator menuSep = new JSeparator();
			JMenuItem menuItem4 = new JMenuItem("Quit");
		
		menuItem1.addActionListener(_ -> loadData(frame));
		menuItem2.addActionListener(_ -> findMedia(frame));
		menuItem3.addActionListener(_ -> rentMedia(frame));
		menuItem4.addActionListener(_ -> exitGUI(frame));
		
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		menu.add(menuSep);
		menu.add(menuItem4);
		menuBar.add(menu);
		
		//set menubar and location/size of frame
		frame.setJMenuBar(menuBar);
		frame.setLocation(700, 400);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	
	// choose location (on desktop or folder) where you placed media.txt file
	private void loadData(JFrame frame) {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Open");
		chooser.setSelectedFile(null);
		
		int fileChooser = chooser.showOpenDialog(null);
		
		if(fileChooser != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		File selectedFile = chooser.getSelectedFile();
		
		String fileName = selectedFile.getPath();
			manager.loadData(fileName);
	}
	
	// find media 
	private void findMedia(JFrame frame) {
		List<Media> selectedMedia;
		
		do {
			String searchTitle = showInputDialog(null, "Enter the title");
		
			if (searchTitle == null || searchTitle.length() == 0) {
				showMessageDialog(null, "Invalid title value");
				break;
			}
			
			selectedMedia = manager.findItems(searchTitle);
			
			if (selectedMedia.size() > 0) {
				String mediaMsg = "";
				
				for (Media m : selectedMedia)
					mediaMsg += m + "\n";
				
				mediaMsg = mediaMsg.substring(0, mediaMsg.length() - 1);
				showMessageDialog(null, mediaMsg);
				break;
			} else {
				showMessageDialog(null, String.format("There is no media with this title: %s", searchTitle));
				}
			
		} while (selectedMedia.isEmpty());
	}
	
	// rent media
	private void rentMedia(JFrame frame) {
		
		String searchId = showInputDialog(null, "Enter the id");
		
		if (searchId == null)
			return;
		
		int id;
		
		try {
			id = Integer.parseInt(searchId);
			
		} catch (NumberFormatException e) {
			return;
		}
		
		Media item = manager.rentItem(id);
		
		if(item != null){
			showMessageDialog(null, String.format("Media was successfully rented. Rental fee = $%.2f", item.calculateRentalFee()));
		} else {
			showMessageDialog(null, String.format("The media object id=%d is not found", id));
		}
	}
	
	// exit GUI
	private void exitGUI(JFrame frame) {
		showMessageDialog(null, "Thank you for using the program. Goodbye!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new MediaRentalSystem().go();
	}
}