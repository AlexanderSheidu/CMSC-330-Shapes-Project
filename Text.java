import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Declare these, to use these imports

/*
* The first programming project involves extending the Java skeleton program that it is provided in 
* the attached .zip file. That skeleton program displays a scene of graphic images contained in a 
* scene definition file.
*/

/**
* @author Alexander Sheidu
* Project 1
* Date: 5/27/2024
* Course: CMSC 330/6380
*/

// Class that gets the Hello World message
// Inheritance

public class Text extends Image {
    Point upperLeft;
    private String text;
    
    // Text Constructor
    public Text(Color color, Point upperLeft, String text) {
        super(color);
        this.upperLeft = upperLeft;
        this.text = text;
    }
    
    // Override the respective super class
    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(text, upperLeft.x, upperLeft.y);
    }
}
