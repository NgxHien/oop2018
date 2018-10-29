package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Class Circle kế thừa từ lớp Shape
 * @author NgxHien
 */
class Circle extends Shape {
    protected Point point;
    protected double radius;

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.point.x, this.point.y, (int)this.radius, (int)this.radius);
    }

    @Override
    public void move() {
        this.point.x += this.velocity.x;
        this.point.y += this.velocity.y;

        if (this.point.x <= 0 || (this.point.x + this.radius) >= Diagram.WIDTH) { // out of horizontal range
            this.velocity.x = -this.velocity.x;
        }

        if (this.point.y <= 0 || (this.point.y + this.radius) >= Diagram.HEIGHT) { // out of vertical range
            this.velocity.y = -this.velocity.y;
        }
    }

    @Override
    public String toString() {
        return String.format("Circle[%s]", this.point);
    }
}