package lambdas;

import java.awt.Color;
import java.util.Random;

import edu.macalester.graphics.*;
import edu.macalester.graphics.events.*;
import edu.macalester.graphics.ui.Button;

/**
 * Class which demonstrates the interaction of CanvasWindow's animate()
 * with user input (mouse motion listeners)
 * 
 * Admittedly not the cleanest decomposition.
 * 
 * @author Abby Marsh
 * Spring 2024
 */
public class AnimateAndDrag {
    /* 
     * Static instance variables so that we can set flags to be used within
     * our animate and mouse event closures.
     */  
    private static boolean animating;
    private static int ballDir;
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Colors", 500, 500);
        canvas.setBackground(Color.BLACK);

        Random rand = new Random();

        animating = true;

        /*
         * Ball object which will be used for a "screensaver" effect
         * When the user is not drawing on the canvas, a ball will bounce
         * from top to bottom.
         */
        Ellipse ball = new Ellipse(250, 0, 5, 5);
        ball.setFilled(true);
        ball.setFillColor(Color.WHITE);
        ball.setStroked(false);
        ballDir = 3;
        canvas.add(ball);

        /*
         * Button used to clear drawings from canvas.
         */
        Button clearCanvas = new Button("Clear");
        clearCanvas.setPosition(10, 10);
        canvas.add(clearCanvas);

        /*
         * When the button is clicked, remove all elements and restore only
         * the button and the ball.
         */
        clearCanvas.onClick(() ->
        {
            canvas.removeAll();
            canvas.add(clearCanvas);
            canvas.add(ball);
        });

        /*
         * Stop animating and remove our screensaver when user begins drawing.
         */
        canvas.onMouseDown(
            e -> {
                canvas.remove(ball);
                animating = false;
            }
        );

        /* 
         * Resume animating and restore our screensaver when user finishes drawing.
         */
        canvas.onMouseUp(
            e -> {
                animating = true;
                canvas.add(ball);
            }
        );

        /* 
         * When a user drags the mouse, draw colorful lines following that path.
         */
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

        /*
         * Animation process:
         *  Only runs while user not drawing
         *  - If ball is moving in a positive direction (down),
         *      - Keep moving down,
         *      - Unless we have hit the bottom, then reverse
         *  - If ball is moving in a negative direction (up),
         *      - Reverse if we hit the top,
         *      - Otherwise keep moving up
         */
        canvas.animate(
            () ->
            {
                if(animating) {
                    if(ballDir > 0) {
                    if((ball.getY() + ball.getHeight()) < canvas.getHeight()) {
                        ball.setY(ball.getY() + ballDir);
                    } else {
                        ballDir = -ballDir;
                        ball.setY(ball.getY() + ballDir);
                    }
                } else {
                    if(ball.getY() < 0) {
                        ballDir = -ballDir;
                        ball.setY(ball.getY() + ballDir);
                    } else {
                        ball.setY(ball.getY() + ballDir);
                    }
                }
                }
            }
        ); 

        /* End of Main Method */
    }
    
}
