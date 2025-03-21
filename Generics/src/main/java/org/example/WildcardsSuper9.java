package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class WildcardsSuper9 {
    public static void main(String[] args) {
        List<Number> listaNumeros = new ArrayList<>();
        agregarNumero(listaNumeros);

        List<Object> listaObjetos = new ArrayList<>();
        agregarNumero(listaObjetos);

//        recorrerList(listaNumeros);

        printList(listaNumeros);
    }

    public static void agregarNumero(List<? super Integer> lista) {
        lista.add(10); //Se pueden agregar elementos de tipo Integer
        lista.add(20);
        System.out.println("Lista después de agregar: " + lista);
    }

    public static void recorrerList(List<? extends Integer> lista) {
        for (Number num : lista) {
            System.out.println(num); //Puede LEERSE sin problemas - No agregar
        }
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);// Solo puedes leer elementos como Object.
        }
    }
}

