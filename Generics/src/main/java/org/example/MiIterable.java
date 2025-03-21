package org.example;

import java.util.Iterator;

public class MiIterable implements Iterable<String>{
    private String[] nombres;
    private int tamaño;

    public MiIterable(String[] nombres) {
        this.nombres = nombres;
        this.tamaño = nombres.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new MiIterator(nombres, tamaño);
    }
}
