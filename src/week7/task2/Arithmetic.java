package week7.task2;

public class Arithmetic {
    public void print() {
        throw new ArithmeticException();
    }
    public static void main(String[] args){
        try {
            Arithmetic arithmetic = new Arithmetic();
            arithmetic.print();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
