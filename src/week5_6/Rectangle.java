package week5_6;

/**
 * Thừa kế từ lớp Shape
 * Gồm 2 thuộc tính width(chiều dài), length(chiều rộng)
 * @author NgxHien
 */
public class Rectangle extends Shape {
    protected double width;
    protected double height;
    int Speed;
    /**
     * Getter, setter
     */
    public void setWidth(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return height;
    }
    /**
     * Chuyển động
     */
    public void moving(){
        if (x>Diagram.getMainFrame().getHeight() - height - 15 || x<=0)
            x = -x;
        if (y>Diagram.getMainFrame().getWidth() - width - 15 || y <=0)
            y = -y;
        x = x + Speed;
        y = y + Speed;
    }
}