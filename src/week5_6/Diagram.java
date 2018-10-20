package week5_6;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Diagram {
    private static JFrame mainFrame = new JFrame("Moving Ball");

    public static JFrame getMainFrame() {
        return mainFrame;
    }

    public static void main(String[] args) {
        List<Layer> list = new ArrayList<>();
        list.add(new Layer());
        mainFrame.setSize(600,600);
        mainFrame.setVisible(true);

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
