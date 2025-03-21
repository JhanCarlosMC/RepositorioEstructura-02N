package org.example;

public class Par6<T> {
    private T a, b;

    public Par6(T a, T b){
        this.a = a;
        this.b = b;
    }
    public Par6<T> swap (){
        return new Par6<T>(b, a);
    }

    @Override
    public String toString() {
        return "Par{" + a +" - "+ b + '}';
    }
}
