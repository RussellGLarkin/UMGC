package RLarkin_Project_1;

//Russell Larkin
//24 March 2024
//CMSC 330 Advanced Programming Languages
//Project 1

//Class that defines a solid regular polygon

import java.awt.*;
import java.lang.Math;

class RegularPolygon extends SolidPolygon {
	
	// Constructor that initializes the vertices of the regular polygon

    public RegularPolygon(Color color, Point center, int sides, int radius) {
        super(color, sides); 
        
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];
        
//        double angle = 2 * Math.PI / sides;
        
        for (int i = 0; i < sides; i++) {
            x_points[i] = (int) (center.x + radius * Math.cos(i * (2 * Math.PI / sides)));
            y_points[i] = (int) (center.y + radius * Math.sin(i * (2 * Math.PI / sides)));
        }
        createPolygon(x_points, y_points);
    }
}
