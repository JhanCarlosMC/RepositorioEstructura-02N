package co.edu.uniquindio;

public class MainGenericMethodRestrictions7 {

    public static void main(String[] args) {
        Integer[] enteros = {1, 2, 3, 4, 5};
        Double[] decimales = {1.5, 2.5, 3.5, 4.5, 5.5};

        System.out.println(average(enteros));
        System.out.println(average(decimales));

//        String[] palabras = {"uno", "dos", "tres"};
//        System.out.println(average(palabras)); // ERROR: String no es Number
    }

    public static <T extends Number> Double average(T[] numbers){
        double sum = 0;

        for(T num : numbers){
            sum += num.doubleValue();
        }
        return sum / numbers.length;
    }
}
