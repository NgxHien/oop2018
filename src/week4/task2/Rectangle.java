package week4.task2;
/**
 * Thừa kế từ lớp Shape
 * Gồm 2 thuộc tính width(chiều dài), length(chiều rộng)
 * @author NgxHien
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Khởi tạo Rectangle
     */
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

    /**
     * Getter, setter
     */
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

    /**
     * @return trả về diện tích
     */
    public double getArea(){
        return getWidth()*getLength();
    }

    /**
     * @return trả về chu vi
     */
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }

    /**
     * @return trả về thông tin của hình chữ nhật
     */
    public String toString(){
        return getWidth()+"\t"+getLength()+"\t"+ super.toString();
    }
}