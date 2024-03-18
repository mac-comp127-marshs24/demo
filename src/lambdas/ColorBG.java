package lambdas;

import java.awt.Color;
import java.util.Random;

import edu.macalester.graphics.*;
import edu.macalester.graphics.events.*;

public class ColorBG {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Colors", 500, 500);

        canvas.setBackground(Color.BLACK);
        Random rand = new Random();

        // canvas.onClick(
        //     (MouseButtonEvent e) ->
        //     {canvas.setBackground(
        //         new Color(rand.nextInt(256),
        //             rand.nextInt(256),
        //             rand.nextInt(256))
        //     );}
        // );

        canvas.onDrag(
            (MouseMotionEvent event) ->
            {
                Line l = new Line(event.getPosition(), event.getPreviousPosition());
                l.setStrokeColor(new Color(rand.nextInt(256),
                             rand.nextInt(256),
                             rand.nextInt(256)));
                canvas.add(l);
            }
        );
 
    }
    
}
