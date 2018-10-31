package week7.task2;

public class ArrayIndexOfBounds {
    public void print() {
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void main(String[] args){
        try {
            ArrayIndexOfBounds arrayIndexOfBounds = new ArrayIndexOfBounds();
            arrayIndexOfBounds.print();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
