package week4.task2;
/**
 *
 * @author NgxHien
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return getWidth()*getLength();
    }
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }
    public String toString(){
        return getWidth()+"\t"+getLength()+"\t"+ super.toString();
    }
}