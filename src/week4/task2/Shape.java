package week4.task2;
/**
 * Class Shape có 2 thuộc tính Color(máu sắc) và filled(có chứa màu không ?)
 * @author NgxHien
 */
public class Shape {
    protected String color;
    protected boolean filled;
    /**
     * Khởi tạo Shape(getter, setter)
     */
    public Shape() {
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }
    public String toString() {
        return getColor()+"\t"+getFilled();
    }
}