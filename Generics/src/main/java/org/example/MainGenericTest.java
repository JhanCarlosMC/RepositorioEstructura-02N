package org.example;

public class MainGenericTest {
    public static void main(String[] args) {
        GenericClass2 newGenericClass = new GenericClass2<>(false);

        System.out.println(newGenericClass.getAtributo());
        newGenericClass.setAtributo("Jhan");
        System.out.println(newGenericClass.getAtributo());

        GenericClassTwo3 newGenericClassTwo = new GenericClassTwo3("Jhan", 24);
        System.out.println(newGenericClassTwo.getAtributoUno() + " - " + newGenericClassTwo.getAtrbutoDos());

        GenericClassTwo3 newGenericClassTest = new GenericClassTwo3(newGenericClassTwo, true);
        System.out.println(newGenericClassTest.getAtributoUno() + " - " + newGenericClassTest.getAtrbutoDos());

    }
}
