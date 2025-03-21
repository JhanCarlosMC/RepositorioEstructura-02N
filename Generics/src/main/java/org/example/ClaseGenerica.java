package org.example;

public class ClaseGenerica<T>{
    private T atributoGenerico;
    private T atributoGenericoGenerico;

    public ClaseGenerica(T atributoGenerico, T atributoGenericoGenerico) {
        this.atributoGenerico = atributoGenerico;
        this.atributoGenericoGenerico = atributoGenericoGenerico;
    }

}
