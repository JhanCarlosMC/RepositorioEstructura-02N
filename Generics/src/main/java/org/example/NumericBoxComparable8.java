package org.example;

public class NumericBoxComparable8<T extends Number & Comparable<T>>{
    private T number;

    public NumericBoxComparable8(T number) {
        this.number = number;
    }

    public int getNumber(){
        return number.intValue() * 2;
    }

    public boolean mayorQue(T otro){
        return number.compareTo(otro) > 0;
    }
}
