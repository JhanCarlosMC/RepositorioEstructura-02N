package org.example;

import org.example.GenericInterface4;

public class GenericClassTwo3<T,U> implements GenericInterface4<Integer> {
    private T atributoUno;
    private U atrbutoDos;

    public GenericClassTwo3(T atributoUno, U atrbutoDos) {
        this.atributoUno = atributoUno;
        this.atrbutoDos = atrbutoDos;
    }

    public T getAtributoUno() {
        return atributoUno;
    }

    public void setAtributoUno(T atributoUno) {
        this.atributoUno = atributoUno;
    }

    public U getAtrbutoDos() {
        return atrbutoDos;
    }

    public void setAtrbutoDos(U atrbutoDos) {
        this.atrbutoDos = atrbutoDos;
    }

    @Override
    public Integer methodInterface(Integer a, Integer b) {
        return 0;
    }
}
