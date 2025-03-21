package org.example;

//(Upper Bounded Type)
public class NumericBox6<T extends Number>{
    private T number;

    public NumericBox6(T number) {
        this.number = number;
    }

    public int getNumber(){
        return number.intValue() * 2;
    }
}
