public class MainGenerics {

    public static void main(String[] args) {

    }
//Clase Generica Par
    public class Par<T> {
        private T a, b;
        public Par(T a, T b){
            this.a = a;
            this.b = b;
        }
        public Par<T> swap (){
            return new Par<T>(b, a);
        }
    }

    public static void main(String[] args) {
        // Instanciación de la clase genérica para Integer
        // No se puede usar int porque no es una clase
        Par<Integer> p = new Par<Integer>(1,2);
        // Instanciación de la clase genérica para Character
        Par<Character> p1 = new Par<Character>('a','b');
        p = p.swap();
        p1 = p1.swap();
    }


    class GenericClass<T> {
        private T attribute;

        //Metodo generico con parametro T
        public void setAttribute(T attribute) {
            this.attribute = attribute;
        }
        //Metodo generico con retorno T
        public T getAttribute() {
            return attribute;
        }
    }

    // Definimos una clase genérica con tipo T y U
    class GenericClass<T, U> {
        private T attribute1;
        private U attribute2;
    }

    // Definimos una interfaz genérica
    interface GenericInterface<T> {
        T method(T a, T b);
    }

    // Implementación para números enteros
    class Class1 implements GenericInterface<Integer> {
        public Integer method(Integer a, Integer b) {
            return a + b;
        }
    }

    // Implementación para concatenación de Strings
    class Class2 implements GenericInterface<String> {
        public String method(String a, String b) {
            return a + b;
        }
    }

    class CajaNumerica<T extends Number> { }
    class Datos<T extends Number & Comparable<T>> { }

    public static void method(List<? super Integer> lista) { }
    public static <T extends Number> double method(T[] numeros) { }
}
