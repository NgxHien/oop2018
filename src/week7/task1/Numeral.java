package week7.task1;

public class Numeral extends Expression{
    private int value;
    Numeral(){
        value = 0;
    }
    Numeral(int tmpvalue){
        this.value = tmpvalue;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
