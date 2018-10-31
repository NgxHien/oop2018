package week7.task2;

public class NullPointer{
    public void print(){
        throw new NullPointerException();
    }
    public static void main(String[] args){
        try {
            NullPointer nullPointer = new NullPointer();
            nullPointer.print();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
