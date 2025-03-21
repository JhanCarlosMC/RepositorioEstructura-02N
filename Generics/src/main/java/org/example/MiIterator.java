package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MiIterator implements Iterator<String> {
    private String[] nombres;
    private int tamaño;
    private int indice = 0;

    public MiIterator(String[] nombres, int tamaño) {
        this.nombres = nombres;
        this.tamaño = tamaño;
    }

    @Override
    public boolean hasNext() {
        return indice < tamaño;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return nombres[indice++];
    }
}
