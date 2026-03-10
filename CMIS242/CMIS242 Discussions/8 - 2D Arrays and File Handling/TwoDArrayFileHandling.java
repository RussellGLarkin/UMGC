/*	Russell Larkin
 * 	CMIS 242/7384
 * 	06 May 2023
 * 
 *  File Name : <TwoDArrayFileHandling.java>
 * 
 *  Description : <GUI to read a file and input contents into a 2D Array>
 *  
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class TwoDArrayFileHandling {

	public void GUI() {
		
		JFrame frame = new JFrame("Week 8 Discussion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
			JMenuItem menuLoad = new JMenuItem("Load File");
			JSeparator menuSep = new JSeparator();
			JMenuItem closeGUI = new JMenuItem("Quit");
			
		menuLoad.addActionListener(_ -> loadData(frame));
		closeGUI.addActionListener(_ -> exitApplication(frame));
		
		menu.add(menuLoad);
		menu.add(menuSep);
		menu.add(closeGUI);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.setLocation(700, 400);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
	}
	
	// place animals.txt in a folder and navigate to the file using the GUI
	private void loadData(JFrame frame) {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Open");
		chooser.setSelectedFile(null);
		
		int fileChooser = chooser.showOpenDialog(null);
		
		if(fileChooser != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		File selectedFile = chooser.getSelectedFile();

		try (Scanner scanner = new Scanner(selectedFile)) {
		    
		    scanner.nextLine(); // ignore header line
		    
		    // store the data from the file
		    String[][] animals = new String[3][3];
		    for (int i = 0; i < animals.length; i++) {
		        for (int j = 0; j < animals[0].length; j++) {
		            animals[i][j] = scanner.next();
		        }
		    }
		    // print the stored data
		    for (int i = 0; i < animals.length; i++) {
		        for (int j = 0; j < animals[0].length; j++) {
		            System.out.print(animals[i][j] + "\t ");
		        }
		        System.out.println();
		    }
		    
		} catch (FileNotFoundException a) {
		    System.out.println("File Not Found");
		    a.printStackTrace();
		}
	}
	
	// Quit GUI
	private void exitApplication(JFrame frame) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new TwoDArrayFileHandling().GUI();
	}
}