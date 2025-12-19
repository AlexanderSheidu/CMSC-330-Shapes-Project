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

// Class that gets the Regular Polygon

public class RegularPolygon extends SolidPolygon {
    public RegularPolygon(Color color, int sideCount, Point center, int radius) {
        super(color, sideCount);
        int x_points[] = new int[sideCount];
        int y_points[] = new int[sideCount];

        for (int i=0; i<sideCount; i++) {
            x_points[i] = center.x + (int)(radius * Math.cos((2*Math.PI/sideCount)*i));
            y_points[i] = center.y + (int) (radius * Math.sin((2*Math.PI/sideCount)*i));
        }

        createPolygon(x_points, y_points);
    }
}
