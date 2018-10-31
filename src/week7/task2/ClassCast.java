package week7.task2;

public class ClassCast {
    public int converters() {
        throw new ClassCastException();
    }
    public static void main(String[] args){
        try {
            ClassCast classCast = new ClassCast();
            classCast.converters();
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}

