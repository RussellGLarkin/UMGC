package RLarkin_Project_1;

//Russell Larkin
//24 March 2024
//CMSC 330 Advanced Programming Languages
//Project 1

//Class that defines a solid parallelogram

import java.awt.*;

class Parallelogram extends SolidPolygon {
	
	// Constructor that initializes the vertices of the parallelogram

	public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
		super(color, 4); // 4 is vertex count for a parallelogram
		
        int[] x_points = {upperLeft.x, lowerRight.x, lowerRight.x - offset, upperLeft.x - offset};
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
        
        createPolygon(x_points, y_points);
	}
}
