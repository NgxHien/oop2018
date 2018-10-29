package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Layer extends JPanel {

    private java.util.List<Shape> shapes = new ArrayList<>();

    public Layer(int w, int h) {
        this.setBounds(0, 0, w, h);
    }

    public void moveShapes() {
        for (Shape shape : shapes) {
            shape.move();
            //System.out.println(shape);
        }
        this.repaint();
    }

    public void removeTriangles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s instanceof Triangle) {
                shapes.remove(i);
            }
        }
    }

    public void removeCircles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
}

