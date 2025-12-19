import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

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

// Class that gets the Solid Polygon

public class SolidPolygon extends Polygon_ {

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }
    
    // Override the super class
    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);
    }
    
}
