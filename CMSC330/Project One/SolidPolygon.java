package RLarkin_Project_1;

//Russell Larkin
//24 March 2024
//CMSC 330 Advanced Programming Languages
//Project 1

//Class that defines a solid regular polygon

import java.awt.*;

// Class that defines all solid polygons

class SolidPolygon extends Polygon_{
	
    // Constructor that calls super constructor

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws solid polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);
    }
}
