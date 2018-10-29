package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Triangle extends Shape {

    Point a;
    Point b;
    Point c;

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillPolygon(
                new int[]{ a.x , b.x, c.x },
                new int[]{ a.y, b.y, c.y },
                3
        );
    }

    @Override
    public void move() {
        this.a.x += this.velocity.x;
        this.a.y += this.velocity.y;

        this.b.x += this.velocity.x;
        this.b.y += this.velocity.y;

        this.c.x += this.velocity.x;
        this.c.y += this.velocity.y;

        int minX = Math.min(Math.min(this.a.x, this.b.x), this.c.x);
        int minY = Math.min(Math.min(this.a.y, this.b.y), this.c.y);

        int maxX = Math.max(Math.max(this.a.x, this.b.x), this.c.x);
        int maxY = Math.max(Math.max(this.a.y, this.b.y), this.c.y);

        if (minX <= 0 || maxX >= Diagram.WIDTH) {
            this.velocity.x = -this.velocity.x;
        }

        if (minY <= 0 || maxY >= Diagram.HEIGHT) {
            this.velocity.y = -this.velocity.y;
        }

    }
}