package org.example;


import org.example.GenericInterface4;

public class GenericClass2<T> implements GenericInterface4<String> {
    private T atributo;

    public GenericClass2(T atributo) {
        this.atributo = atributo;
    }

    public T getAtributo() {
        return atributo;
    }

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    //Metodo generico con parametro S
    public <S> void methodGeneric(S attribute){}

    @Override
    public String methodInterface(String a, String b) {
        return null;
    }
}
