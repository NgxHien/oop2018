package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * @author NgxHien
 */
abstract class Shape {
    public Object moving;
    int x,y;
    private Color color = new Color((new Random()).nextInt(255),(new Random()).nextInt(255),(new Random()).nextInt(255));

    public Color getColor() {
        return color;
    }
    abstract public void moving(){};
}