package co.edu.uniquindio.colas;

public class BiCola <T> extends Cola{
    public BiCola(){
        super();
    }

    public void agregarFrente(T valor){
        Nodo<T> newNodo = new Nodo<>(valor);

        if (isVacia()){
            inicial = newNodo;
            fin = newNodo;
        }else{
            newNodo.setSiguiente(inicial);
            inicial = newNodo;
        }

        tamanio++;
    }

    public void eliminarFinal(){
        if(isVacia()){
            return;
        }else if(inicial==fin){
            inicial = null;
            fin = null;
        }
        else {
            Nodo<T> nodoRecorrer = inicial;

            while (nodoRecorrer.getSiguiente() != fin){
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
            fin = nodoRecorrer;
            fin.setSiguiente(null);
            tamanio--;
        }
    }

}
