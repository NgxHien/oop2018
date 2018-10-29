package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class Diagram extends JFrame implements KeyListener {
    static int WIDTH = 600;
    static int HEIGHT = 600;

    private JLayeredPane layeredPane = new JLayeredPane();
    private java.util.List<Layer> layers = new ArrayList<>();

    public Diagram(int w, int h) {
        this.setPreferredSize(new Dimension(h, w));
        this.setLayout(new BorderLayout());

        this.add(this.layeredPane, BorderLayout.CENTER);
        this.layeredPane.setBounds(0, 0, w, h);

        this.addKeyListener(this);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'c') {
            this.removeCircles();
        }
    }

    public void removeCircles() {
        for (Layer layer : layers) {
            layer.removeCircles();
        }
    }

    public void moveShapes() {
        while (true) {
            for (Layer layer : layers) {
                layer.moveShapes();
            }
            try {
                Thread.sleep(20);
            } catch(Exception e) {}
        }
    }

    private static int layerIndex = 0;
    public void addLayer(Layer layer) {
        this.layers.add(layer);
        this.layeredPane.add(layer, layerIndex++, 0);
    }
}
