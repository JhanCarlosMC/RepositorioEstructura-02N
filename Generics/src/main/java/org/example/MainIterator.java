package org.example;

import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Juan", "Pedro", "Maria"};
        MiIterable miLista = new MiIterable(nombres);

        // Uso de Iterator directamente
        Iterator<String> iterator = miLista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------");

        // Iterando con for-each
        for (String nombre : miLista) {
            System.out.println(nombre);
        }


    }
}
