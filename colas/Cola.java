package co.edu.uniquindio.colas;

public class Cola <T>{
    protected Nodo<T>  inicial, fin;
    protected int tamanio;

    public Cola() {
        this.inicial = this.fin =null;
        this.tamanio = 0;
    }

    //Ingresar - Metodo para agregar un elemento a la cola
    public void encolar(T valor) {
        Nodo<T> newNodo = new Nodo<>(valor);

        if(isVacia()){
            inicial = newNodo;
            fin = newNodo;
        }else{
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }

        tamanio++;
    }

    //Eliminar - Metodo para quitar un elemento de la cola
    public void desencolar() {
        if(isVacia()){
            return;
        }else{
            inicial = inicial.getSiguiente();
            tamanio--;
        }
    }

    //Obtiene la cabeza de la cola
    public T obtenerInicial(){
        return inicial.getValor();
    }

    public boolean isVacia() {
        return this.inicial == null;
    }

    public Nodo<T> getInicial() {
        return inicial;
    }

    public void setInicial(Nodo<T> inicial) {
        this.inicial = inicial;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
