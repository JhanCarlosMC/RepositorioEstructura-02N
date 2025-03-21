package org.example;

public class Main1 {
    public static void main(String[] args) {

        String[] arregloStrings = {"hola", "Adios"};
        Integer[] arregloInteger = {12, 14};

       imprimirArreglo(arregloStrings);
        System.out.println("");
       imprimirArreglo(arregloInteger);
    }

//    public static void imprimirArreglo(Integer[] arregloEntrada){
//        for (Integer elemento : arregloEntrada){
//            System.out.print(elemento + " ");
//        }
//    }
//    public static void imprimirArreglo(Double[] arregloEntrada){
//        for (Double elemento : arregloEntrada){
//            System.out.print(elemento + " ");
//        }
//    }

    public static <E> void imprimirArreglo(E[] arregloEntrada){
        for (E elemento : arregloEntrada){
            System.out.print(elemento + " ");
        }
    }
}