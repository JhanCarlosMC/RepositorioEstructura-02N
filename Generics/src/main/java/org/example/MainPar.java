package org.example;

public class MainPar {
    public static void main(String[] args) {
        // Instanciación de la clase genérica para Integer
        // No se puede usar int porque no es una clase
        Par6<Integer> p = new Par6<>(1,2);

        // Instanciación de la clase genérica para Character
        Par6<Character> p1 = new Par6<>('a','b');

        System.out.println(p);
        p = p.swap();
        System.out.println(p);

        System.out.println(p1);
        p1 = p1.swap();
        System.out.println(p1);
    }
}
