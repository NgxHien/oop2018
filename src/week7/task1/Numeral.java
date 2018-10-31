package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(){
        value = 0;
    }
    public Numeral(int tmpvalue){
        this.value = tmpvalue;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue() + "";
    }

    @Override
    public int evaluate() {
        return this.getValue();
    }
}
