package org.example;

public class ClaseGenericosDos<T,U,S>{
    private T atributoGenerico;
    private U atributoGenericoGenerico;
    private S siguiente;

    public ClaseGenericosDos(T atributoGenerico, U atributoGenericoGenerico, S siguiente) {
        this.atributoGenerico = atributoGenerico;
        this.atributoGenericoGenerico = atributoGenericoGenerico;
        this.siguiente = siguiente;
    }

    public T getAtributoGenerico() {
        return atributoGenerico;
    }

    public void setAtributoGenerico(T atributoGenerico) {
        this.atributoGenerico = atributoGenerico;
    }

    public U getAtributoGenericoGenerico() {
        return atributoGenericoGenerico;
    }

    public void setAtributoGenericoGenerico(U atributoGenericoGenerico) {
        this.atributoGenericoGenerico = atributoGenericoGenerico;
    }

    public S getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(S siguiente) {
        this.siguiente = siguiente;
    }
}
