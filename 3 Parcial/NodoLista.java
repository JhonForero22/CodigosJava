public class NodoLista {

    private NodoLista siguiente;
    private int numero;
    
    public NodoLista(NodoLista Nsiguiente, int Nnumero){
        siguiente = Nsiguiente;
        numero = Nnumero;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
