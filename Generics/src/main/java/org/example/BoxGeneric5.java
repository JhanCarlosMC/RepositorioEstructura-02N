package co.edu.uniquindio;

public class BoxGeneric5 <T>{
    private T t;

    public BoxGeneric5(T t) {
        this.t = t;
    }

    public BoxGeneric5() {
    }

    public T get() { return t; }
    public void set(T t) { this.t = t; }
}
