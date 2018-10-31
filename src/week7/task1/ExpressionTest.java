package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Numeral num10 = new Numeral(10);
        Numeral num2 = new Numeral(2);
        Numeral num3 = new Numeral(3);
        Numeral num1 = new Numeral(1);

        System.out.println((10*10 - 1 + 2*3)*(10*10 - 1 + 2*3));
        Square sqr10 = new Square(num10);
        Subtraction sub = new Subtraction(sqr10,num1);
        Multiplication multi = new Multiplication(num2,num3);
        Addition add = new Addition(sub,multi);
        Square sqrSUM = new Square(add);
        System.out.println(sqrSUM.evaluate());
        try {
            Numeral num0 = new Numeral();
            Division div = new Division(num10,num0);
            System.out.println(div.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
