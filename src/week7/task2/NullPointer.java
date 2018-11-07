package week7.task2;

public class NullPointer{
    public void print(){
        String s = new String();
        System.out.println(s.toString());
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
