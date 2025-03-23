package org.example.listadoblementeenlazada;

public class Nodo<E> {
    //Si se agregar una referencia aun nodo "anterior" prodria ser doblemente enlazada

    private E elemento;
    private Nodo<E> siguiente;

    public Nodo(E elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
}