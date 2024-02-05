package graphics;

import edu.macalester.graphics.*;
import edu.macalester.graphics.Rectangle;
import java.awt.*;

public class firstDrawing {

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Demo Drawing", 500, 500);

        Rectangle rect = new Rectangle(0, 0, 50, 50);

        rect.setCenter(250, 250);

        rect.setFillColor(Color.MAGENTA);
        rect.setStroked(false);

        canvas.add(rect);

        for(int i = 0; i < 256; i++) {
            Rectangle r = new Rectangle(0, i, 50, 50);
            r.setStroked(false);
            r.setFillColor(new Color(i, 0, i));

            canvas.add(r);
        }
    }
    
}
