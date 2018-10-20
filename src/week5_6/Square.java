package week5_6;

/**
 * Square kế thừa từ Class Rectangle
 * @author NgxHien
 */
public class Square extends Rectangle {
    int Speed;

    /**
     * Getter, setter
     */
    public void setSide(double side) {
        width = side;
        height = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

}