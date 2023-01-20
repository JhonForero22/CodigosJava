//Clase NodoPila
public class Nodo {
    // Atributos de la clase NodoPila
    int dato;
    Nodo siguiente;

    // Constructor
    public Nodo(int NumeroDato) {
        // Se guardan los datos con el constructor
        this.dato = NumeroDato;
        siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}