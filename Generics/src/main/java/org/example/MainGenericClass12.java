package co.edu.uniquindio;

public class MainGenericClass12 {
    public static void main(String[] args) {
        BoxGeneric5<String> cajaTexto = new BoxGeneric5<>("Hola Mundo");
        BoxGeneric5<Integer> cajaNumero = new BoxGeneric5<>(100);

//        mostrarCaja(cajaTexto);
//        mostrarCaja(cajaNumero);
    }
    
    public static void mostrarCaja(BoxGeneric5<? extends Number> caja) {
        System.out.println("El contenido de la caja es: " + caja.get());
    }


}
