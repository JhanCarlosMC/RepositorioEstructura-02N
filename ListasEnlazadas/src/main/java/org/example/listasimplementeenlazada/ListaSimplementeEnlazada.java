package org.example.listasimplementeenlazada;

public class ListaSimplementeEnlazada {
    private Nodo inicial;
    private int tamanio;

    public ListaSimplementeEnlazada() {
        inicial = null;
        tamanio = 0;
    }

    public void agregarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        nuevoNodo.setSiguiente(inicial);
        inicial = nuevoNodo;
        tamanio++;
    }

    public void agregarFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);

        if(inicial == null) {
            inicial = nuevoNodo;
            tamanio++;
            return;
        }

        if(inicial.getSiguiente()  != null) {
            Nodo nodoRecorrer = inicial.getSiguiente();

            while(nodoRecorrer.getSiguiente() != null) {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }

            nodoRecorrer.setSiguiente(nuevoNodo);
            tamanio++;
        }
    }

    public void eliminar(int dato){
        if(inicial == null) return;

        if(inicial.getDato() == dato && inicial.getSiguiente() == null) {
            inicial = null;
            tamanio--;
            return;
        }

        Nodo nodoRecorrer = inicial;

        while(nodoRecorrer.getSiguiente() != null ) {
            if(nodoRecorrer.getSiguiente().getDato() == dato){
                nodoRecorrer.setSiguiente(nodoRecorrer.getSiguiente().getSiguiente());
                tamanio--;
                break;
            }else {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }
    }

    public boolean obtener(int dato){
        Nodo recorrerNodo = inicial;

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
        Nodo recorrerNodo = inicial;
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

    public String mostrar(){
        Nodo nodoRecorrer = inicial;
        String cadena = "";

        while (nodoRecorrer != null) {
            if(nodoRecorrer.getSiguiente() != null) {
                cadena += nodoRecorrer.getDato() + " -> ";
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }else{
                cadena += nodoRecorrer.getDato();
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }

        return cadena;
    }
}
