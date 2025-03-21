package co.edu.uniquindio;

import java.util.*;

public class MainIteratorCollections {
    public static void main(String[] args) {
        // 1. Usando Iterator con ArrayList
        List<String> lista = new ArrayList<>(Arrays.asList("Ana", "Juan", "Pedro", "Maria"));

        Iterator<String> iteratorLista = lista.iterator();
        System.out.println("ArrayList:");
        while (iteratorLista.hasNext()) {
            System.out.println(iteratorLista.next());
        }

        // 2. Usando Iterator con LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        Iterator<Integer> iteratorLinkedList = linkedList.iterator();
        System.out.println("\nLinkedList:");
        while (iteratorLinkedList.hasNext()) {
            System.out.println(iteratorLinkedList.next());
        }

        // 3. Usando Iterator con HashSet
        Set<Double> setNumeros = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        Iterator<Double> iteratorSet = setNumeros.iterator();
        System.out.println("\nHashSet:");
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
        }

        // 4. Usando Iterator con TreeSet
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Perro", "Gato", "Elefante", "León"));
        Iterator<String> iteratorTreeSet = treeSet.iterator();
        System.out.println("\nTreeSet:");
        while (iteratorTreeSet.hasNext()) {
            System.out.println(iteratorTreeSet.next());
        }

        // 5. Usando Iterator con HashMap (Iterando sobre las claves)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Rojo");
        hashMap.put(2, "Verde");
        hashMap.put(3, "Azul");

        Iterator<Integer> iteratorMapKeys = hashMap.keySet().iterator();
        System.out.println("\nHashMap (Keys):");
        while (iteratorMapKeys.hasNext()) {
            Integer key = iteratorMapKeys.next();
            System.out.println("Clave: " + key + ", Valor: " + hashMap.get(key));
        }

        // 6. Usando Iterator con HashMap (Iterando sobre las entradas)
        Iterator<Map.Entry<Integer, String>> iteratorMapEntries = hashMap.entrySet().iterator();
        System.out.println("\nHashMap (Entries):");
        while (iteratorMapEntries.hasNext()) {
            Map.Entry<Integer, String> entry = iteratorMapEntries.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
