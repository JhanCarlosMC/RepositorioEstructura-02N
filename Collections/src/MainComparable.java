import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {

    public static void main(String[] args) {

        //Comparable
        ComparablePerson newComparable = new ComparablePerson(23);
        ComparablePerson newComparableDos = new ComparablePerson(26);

        System.out.println(newComparable.compareTo(newComparableDos));
        System.out.println(newComparableDos.compareTo(newComparable));


        //Comparator
        newComparable.setNombre("Jhan");
        //[23, Jhan]
        newComparableDos.setNombre("Andres");
        //[26, Andres]

        List<ComparablePerson> personas = new ArrayList<>();
        personas.add(newComparable);
        personas.add(newComparableDos);

        Collections.sort(personas);
        System.out.println(personas.toString());

        Collections.sort(personas, new ComparatorByName()); //Conparacion por criterio propio
        System.out.println(personas.toString());

    }
}
