package org.example.listadoblementeenlazada;

public class ListaCircularSimplementeEnlazada<E> {
    private Nodo<E> primero;
    private Nodo<E> ultimo;
    private int tamanio;

    public ListaCircularSimplementeEnlazada() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    //Funcion para agregar un elemento estricamente de primero en la lista
    public void agregarDePrimero(E dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (primero == null) {
            primero = nuevoNodo;
            ultimo = primero;
            nuevoNodo.setSiguiente(primero);
            tamanio++;
        }else {
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
            ultimo.setSiguiente(primero);
            tamanio++;
        }
    }

    //Funcion para agregar un elemento estricamente de ultimo en la lista
    public void agregarDeUltimo(E dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (ultimo == null || primero == null) {
            ultimo = nuevoNodo;
            primero = ultimo;
            nuevoNodo.setSiguiente(primero);
            tamanio++;
        }else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
            ultimo.setSiguiente(primero);

            tamanio++;
        }
    }

    public boolean insertarAntesDe(Nodo<E> nodoAInsertar, Nodo<E> nodoObjetivo) {
        if (primero == null) {
            return false;
        }
        if (primero==nodoObjetivo) {
            nodoAInsertar.setSiguiente(primero);
            primero = nodoAInsertar;
            return true;
        }
        Nodo<E> auxiliar = primero;
        while (auxiliar.getSiguiente() != null) {
            if (auxiliar.getSiguiente() == nodoObjetivo) {
                nodoAInsertar.setSiguiente(auxiliar.getSiguiente());
                auxiliar.setSiguiente(nodoAInsertar);
                return true;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return false;
    }

    public boolean insertarDespuesDe(Nodo<E> nodoAInsertar, Nodo<E> nodoObjetivo) {


        if (primero == null) {
            return false;
        }
        Nodo<E> auxiliar = primero;
        while (auxiliar!=null) {
            if(auxiliar==nodoObjetivo) {
                nodoAInsertar.setSiguiente(auxiliar.getSiguiente());
                auxiliar.setSiguiente(nodoAInsertar);
                return true;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return false;
    }

    public boolean obtener(int dato){
        org.example.listasimplementeenlazada.Nodo recorrerNodo = inicial;

        while(recorrerNodo != null) {
            if(recorrerNodo.getDato() == dato){
                return true;
            }else {
                recorrerNodo = recorrerNodo.getSiguiente();
            }
        }

        return false;
    }

    public int localizar(int dato){
        org.example.listasimplementeenlazada.Nodo recorrerNodo = inicial;
        int contador = 0;

        while(recorrerNodo != null) {
            if(recorrerNodo.getDato() == dato){
                return contador;
            }else{
                recorrerNodo = recorrerNodo.getSiguiente();
                contador++;
            }
        }

        return -1;
    }

    //Funcion para mostrar la lista en forma de "String"
    public String mostrarLista() {
        String cadena = "";
        if (primero == null) {
            cadena = "Lista vacia";
            return cadena;
        }
        Nodo<E> auxiliar = primero;
        while (auxiliar != null) {
            if (auxiliar==primero){
                cadena+=auxiliar.getElemento();
                auxiliar = auxiliar.getSiguiente();
            }
            cadena+="-->"+ auxiliar.getElemento();
            auxiliar = auxiliar.getSiguiente();
        }
        return cadena;
    }
}
