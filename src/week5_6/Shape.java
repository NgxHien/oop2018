package week5_6;

import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected Point velocity;

    public abstract void draw(Graphics g);
    public abstract void move();
}

