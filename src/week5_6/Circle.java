package week5_6;

import java.util.Random;

/**
 * Class Circle kế thừa từ lớp Shape
 * @author NgxHien
 */
public class Circle extends Shape {
    double radius;
    int Speed;
    /**
     * Khởi tạo Circle với tham số là radius
     * @param radius : bán kính
     */
    public Circle(double radius){
        this.radius = radius;
        this.x = 300;
        this.y = 300;
        this.Speed = (new Random()).nextInt(15);
    }

    /**
     * làm chuyển động cho quả bóng
     *
     */
    public void moving(){
        if (x>Diagram.getMainFrame().getHeight() - radius - Speed || x + Speed <=0)
            x = -x;
        if (y>Diagram.getMainFrame().getWidth() - radius - Speed || y + Speed <=0)
            y = -y;
        x = x + Speed;
        y = y + Speed;
    }


}