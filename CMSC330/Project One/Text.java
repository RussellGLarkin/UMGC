package RLarkin_Project_1;

//Russell Larkin
//24 March 2024
//CMSC 330 Advanced Programming Languages
//Project 1

// Base text class

import java.awt.*;

class Text extends Image{
	
	private Point point;
	private String text;
	
	// Constructor that initializes color and location of text

	public Text(Color color, Point point, String text) {
		super(color);
		this.point = point;
		this.text = text;
	}
	
	// Draws text using drawString

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(text, point.x, point.y);
    }
	
}
