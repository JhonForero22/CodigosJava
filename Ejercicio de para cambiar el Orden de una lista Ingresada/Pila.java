//Clae Pila
public class Pila {

    private Nodo cima;
    int tamaño;

    public Pila() {
        this.cima = null;
        this.tamaño = 0;
    }

    // Metodo para saber cuando la Pila esta vacia
    public boolean pilaVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para empujar (push) un elemento de una Pila
    public void push(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    // Metodo para sacar (pop) un elemento en la Pila
    public int pop() {
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return auxiliar;
    }

}
