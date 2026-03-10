package RLarkin_Project_1;

//Russell Larkin
//24 March 2024
//CMSC 330 Advanced Programming Languages
//Project 1

//Class that defines a solid isosceles triangle

import java.awt.*;

class IsoscelesTriangle extends SolidPolygon {
	
	// Constructor that initializes the vertices of the isosceles triangle

    public IsoscelesTriangle(Color color, Point upperCenter, int height, int width) {
        super(color, 3); // 3 is the vertex count for a triangle
        
        int[] x_points = {upperCenter.x, upperCenter.x - (width / 2), upperCenter.x + (width / 2)};
        int[] y_points = {upperCenter.y, upperCenter.y + height, upperCenter.y + height};
        
        createPolygon(x_points, y_points);
    }
}