package week4.task2;

/**
 *
 * @author NgxHien
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        width=side;
        length=side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    public String toString(){
        return super.toString();
    }
}