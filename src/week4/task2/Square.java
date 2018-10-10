package week4.task2;

/**
 * Square kế thừa từ Class Rectangle
 * @author NgxHien
 */
public class Square extends Rectangle {
    /**
     * Khởi tạo Square
     */
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Getter, setter
     */
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

    /**
     * @return trả về thông tin của Square
     */
    public String toString(){
        return super.toString();
    }
}