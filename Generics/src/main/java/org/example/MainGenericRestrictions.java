package org.example;

public class MainGenericRestrictions {
    public static void main(String[] args) {
        NumericBox6<Integer> newBox1 = new NumericBox6<>(15);
        System.out.println(newBox1.getNumber());

        NumericBox6<Double> newBox2 = new NumericBox6<>(20.7);
        System.out.println(newBox2.getNumber());

        NumericBoxComparable8<Double> comparableBox1 = new NumericBoxComparable8<>(3.2);
        System.out.println(comparableBox1.mayorQue(3.3));
    }
}
