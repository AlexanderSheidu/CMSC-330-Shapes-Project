import java.awt.Color;
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

// Class that gets Isosceles Triangle info

public class IsoscelesTriangle extends SolidPolygon {
    public IsoscelesTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int x_points[] = {upperLeft.x, upperLeft.x-width/2, upperLeft.x+width/2};
        int y_points[] = {upperLeft.y, upperLeft.y+height, upperLeft.y+height};
        createPolygon(x_points, y_points);
    }
}
