public class Lista {
    // Atributos clase lista
    private Nodo inicio;
    private Nodo fin;

    // Constructor clase lista
    public Lista() {
        inicio = null;
        fin = null;
    }

    // Metodo para saber si la lista esta vacia
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para insertar un dato al nodo
    public void insertarDato(int dato) {
        Nodo nuevo;
        // Veririfica si la lista esta vacia
        if (listaVacia() == true) {
            nuevo = new Nodo(dato);
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo = new Nodo(dato);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    // Metodo para imprimir los datos de una persona
    public void imprimirDatos() {
        Nodo temporal;
        temporal = inicio;
        System.out.print("[ ");
        while (temporal != null) {
            System.out.print(+temporal.dato+" ");
            temporal = temporal.getSiguiente();
        }
        System.out.print("]");
    }

}
