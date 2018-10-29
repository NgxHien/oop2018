package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram(Diagram.WIDTH, Diagram.HEIGHT);

        // bottom layer
        Layer circleLayer = new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        circleLayer.setBackground(Color.WHITE);

        Layer rectangleLayer = new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        rectangleLayer.setOpaque(false); // make layer transparent

        // add bottom layer first
        diagram.addLayer(circleLayer);

        // add other layers
        diagram.addLayer(rectangleLayer);

        Rectangle rec = new Rectangle();
        rec.start = new Point(0, 0);
        rec.color = Color.BLUE;
        rec.length = 50;
        rec.width = 70;
        rec.velocity = new Point(ranVelocity(), ranVelocity());

        Circle circle = new Circle();
        circle.color = Color.RED;
        circle.radius = 50;
        circle.point = new Point(100, 100);
        circle.velocity = new Point(ranVelocity(), ranVelocity());

        Circle circle2 = new Circle();
        circle2.color = Color.RED;
        circle2.radius = 50;
        circle2.point = new Point(100, 100);
        circle2.velocity = new Point(ranVelocity(), ranVelocity());

        Triangle tri = new Triangle();
        tri.color = Color.YELLOW;
        tri.a = new Point(200, 200);
        tri.b = new Point(250, 200);
        tri.c = new Point(200, 250);
        tri.velocity = new Point(ranVelocity(), ranVelocity());

        rectangleLayer.addShape(rec);
        circleLayer.addShape(circle);

        rectangleLayer.addShape(circle2);
        rectangleLayer.addShape(tri);

        diagram.moveShapes();
    }

    static Random ran = new Random();
    public static int ranVelocity() {
        return 5 + ran.nextInt(5);
    }
}