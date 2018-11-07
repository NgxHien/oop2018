package week7.task2;

public class ArrayIndexOfBounds {
    public void print() {
        int[] a = new int[5];
        System.out.println(a[6]);
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
