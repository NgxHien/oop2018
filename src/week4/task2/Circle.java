package week4.task2;
/**
 *
 * @author NgxHien
 */
public class Circle extends Shape {
    public final double PI = 3.14;
    protected double radius;
    public Circle(){
        super();
        this.radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI*getRadius()*getRadius();
    }
    public double getPerimeter(){
        return 2*PI*getRadius();
    }
    public String toString() {
        return getRadius() + "\t" + super.toString();
    }
}