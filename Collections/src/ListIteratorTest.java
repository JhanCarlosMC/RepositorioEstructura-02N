import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> listElements = new ArrayList<>();
        listElements.add("Manzana");
        listElements.add("Banana");
        listElements.add("Cereza");

        ListIterator<String> listIterator = listElements.listIterator();

        // Iterar hacia adelante
        while (listIterator.hasNext()) {
            String element = listIterator.next();
//            System.out.println("Elemento: " + element);
        }

        System.out.println("------------------------");
        // Iterar hacia atrás
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
//            System.out.println("Elemento: " + element);
        }
        System.out.println("------------------------");

        // Modificar la lista durante la iteración
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("Banana")) {
                listIterator.set("Naranja"); //Reemplaza
            }
        }
        System.out.println(listElements);
        System.out.println("------------------------");

        // Eliminar elemento de la lista durante la iteración
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("Cereza")) {
                listIterator.remove();  //Elimina
            }
        }
        System.out.println(listIterator.toString());

    }
}
