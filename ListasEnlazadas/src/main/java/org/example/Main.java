package org.example;

import org.example.listasimplementeenlazada.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada miLista = new ListaSimplementeEnlazada();

        miLista.agregarInicio(10);
        miLista.agregarInicio(20);
        System.out.println(miLista.mostrar());

        miLista.agregarFinal(30);
        miLista.agregarFinal(40);
        System.out.println(miLista.mostrar());
    }
}