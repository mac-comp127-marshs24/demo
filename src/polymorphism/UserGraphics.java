package polymorphism;

import java.util.Scanner;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;

public class UserGraphics {

    public static void main(String[] args) {
        GraphicsObject shape;
        CanvasWindow canvas = new CanvasWindow("Shape", 500, 500);
        Scanner scan = new Scanner(System.in);

        System.out.println("Which shape would you like to draw?\n 1 - Ellipse\n 2 - Rectangle");

        int shapeType = scan.nextInt();

        if(shapeType == 1) {
            shape = new Ellipse(0, 0, 50, 50);
        } else if (shapeType == 2) {
            shape = new Rectangle(0, 0, 50, 50);
        } else {
            throw new UnsupportedOperationException("The entered value does not correspond to a shape type.");
        }

        shape.setCenter(250, 250);
        canvas.add(shape);


    }
    
}
