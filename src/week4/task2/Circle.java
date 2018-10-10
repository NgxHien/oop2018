package week4.task2;
/**
 * Class Circle kế thừa từ lớp Shape
 * @author NgxHien
 */
public class Circle extends Shape {
    public final double PI = 3.14;
    protected double radius;

    /**
     * Khởi tạo Circle không có tham số
     */
    public Circle(){
        super();
        this.radius=1.0;
    }

    /**
     * Khởi tạo Circle với tham số là radius
     * @param radius : bán kính
     */
    public Circle(double radius){
        super();
        this.radius=radius;
    }

    /**
     * Khởi tạo Circle
     * @param radius: bán kính
     * @param color: màu sắc
     * @param filled: có được lấp đầy hay chưa
     */
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    /**
     * Đặt lại bán kính cho Circle
     * @param radius
     */
    public void setRadius(double radius){
        this.radius=radius;
    }

    /**
     * @return trả về bán kính
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @return trả về diện tích
     */
    public double getArea() {
        return PI*getRadius()*getRadius();
    }

    /**
     * @return trả về chu vi
     */
    public double getPerimeter(){
        return 2*PI*getRadius();
    }

    /**
     * @return trả về thông số Circle
     */
    public String toString() {
        return getRadius() + "\t" + super.toString();
    }
}