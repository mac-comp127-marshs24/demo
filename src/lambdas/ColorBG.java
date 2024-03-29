package lambdas;

import java.awt.Color;
import java.util.Random;

import edu.macalester.graphics.*;
import edu.macalester.graphics.events.*;
import edu.macalester.graphics.ui.Button;

public class ColorBG {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Colors", 500, 500);

        canvas.setBackground(Color.BLACK);
        Random rand = new Random();

        // canvas.onClick(
        //     (MouseButtonEvent event) ->
        //     {canvas.setBackground(
        //         new Color(rand.nextInt(256),
        //                     rand.nextInt(256),
        //                     rand.nextInt(256))
        //     );}
        // );

        Button clearCanvas = new Button("Clear");
        clearCanvas.setPosition(10, 10);
        canvas.add(clearCanvas);

        clearCanvas.onClick(
            () ->
            {
                canvas.removeAll();
                canvas.add(clearCanvas);
            }
        );

        canvas.onDrag(
            (MouseMotionEvent event) ->
            {
                Line l = new Line(event.getPosition(), event.getPreviousPosition());
                l.setStrokeColor(
                    new Color(rand.nextInt(256),
                                rand.nextInt(256),
                                rand.nextInt(256)) 
                );
                l.setStrokeWidth(3);
                canvas.add(l);
            }
        );
    }
    
}
