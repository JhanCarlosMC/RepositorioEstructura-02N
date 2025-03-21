package co.edu.uniquindio;

public class MainBox {
    public static void main(String[] args) {
        // Uso normal
        BoxGeneric5<Integer> integerBox1 = new BoxGeneric5<Integer>();
        integerBox1.set(100);
        System.out.println("Contenido de integerBox1: " + integerBox1.get());

        // Uso con inferencia de tipo (operador diamante <>)
        BoxGeneric5<Integer> integerBox2 = new BoxGeneric5<>(); // No es necesario repetir <Integer>
        integerBox2.set(200);
        System.out.println("Contenido de integerBox2: " + integerBox2.get());

        //Uso de tipo raw (sin especificar tipo)
        BoxGeneric5 rawBox = new BoxGeneric5(); // No se define T, se usa como Object
        rawBox.set("Esto es un String en un BoxGeneric5 raw");
        System.out.println("Contenido de rawBox: " + rawBox.get());
    }
}
