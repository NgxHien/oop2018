package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private List<Shape> list = new ArrayList<>();
    public void Layer(){
        list.add(new Circle());
        list.add(new );
    }
    public  void paint (Graphics g){
        super.paint(g);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) instanceof Circle) {
                g.fillOval(list.get(i).x,list.get(i).y,list.get(i)).radius,((Circle) list.get(i)).radius());
            }

        }
    }
    public void displayLayer() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 0; i < list.size() ; i++){
                list.get(i).moving();
            }
            this.repaint();
        }
    }
    public void removeTriangle(){
        for (int i=0; i < list.size(); i++){
            if (list.get(i) instanceof Rectangle){
                list.remove(i);
            }
        }
    }
}

