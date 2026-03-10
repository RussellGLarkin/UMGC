/*	Russell Larkin
 * 	CMIS 242/7384
 * 	16 Apr 2023
 * 
 *  File Name : <assignment_3.java>
 * 
 *  Description : <This file creates a GUI with three buttons and listens to inputs from user>
 *  
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIConverter {

	public GUIConverter() {
		
		// buttons
		JButton distanceButton = new JButton("Distance Converter");
		JButton tempButton = new JButton("Temperature Converter");
		JButton exitButton = new JButton("Exit");
		
		// content, window, and three buttons
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(distanceButton, BorderLayout.WEST);
		content.add(tempButton, BorderLayout.EAST);
		content.add(exitButton, BorderLayout.SOUTH);
		
		// window 
		JFrame window = new JFrame("Welcome to Converter");
		window.setContentPane(content);
		window.setSize(350, 200);
		window.setLocation(200, 200);
		window.setVisible(true);
		
		//Action listeners
		distanceButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String inMiles = JOptionPane.showInputDialog(window, "Input miles distance to convert");
				Converter distanceConverted = new DistanceConverter(Double.parseDouble(inMiles));
				double inKilometers = distanceConverted.convert();
				JOptionPane.showMessageDialog(window, inMiles + " Miles equals " + inKilometers + " Kilometers");
			}
		});
		
		tempButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String inFahrenheit = JOptionPane.showInputDialog(window, "Input fahrenheit termperature to convert");
				Converter tempConverted = new TemperatureConverter(Double.parseDouble(inFahrenheit));
				double inCelsius = tempConverted.convert();
				JOptionPane.showMessageDialog(window, inFahrenheit + " F equals " + inCelsius + " C");
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});
		
	}
}
