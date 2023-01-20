public class Lista {

    private NodoLista inicio;
    private NodoLista fin;
    public int numElemen;

    public Lista() {
        inicio = null;
        fin = null;
        numElemen = 0;
    }

    // Metodo para saber si la lista esta vacia
    public boolean listaVacia() {
        // Si la lista esta vacia retorna true
        if (inicio == null) {
            return true;
            // Si la lista no esta vacia devuelve false
        } else {
            return false;
        }
    }

    // Metodo para insertar un dato al nodo
    public void insertarDato(int Nnumero) {
        NodoLista nuevo;
        if (listaVacia() == true) {
            nuevo = new NodoLista(null, Nnumero);
            inicio = nuevo;
            fin = nuevo;
            numElemen++;
        } else {
            nuevo = new NodoLista(null, Nnumero);
            fin.setSiguiente(nuevo);
            fin = nuevo;
            numElemen++;
        }
    }

    // Metodo para buscar una persona dentro del nodo y devolver su informacion
    public void buscarPersona(int numeroBuscar) {
        if (listaVacia() == true) {
            System.out.println("La lista actualmente esta vacia !!!");
        } else {
            NodoLista temporal;
            temporal = inicio;
            boolean encontrado = false;
            while (temporal != null) {
                if (numeroBuscar == temporal.getNumero()) {
                    System.out.println(temporal.getNumero());
                    encontrado = true;
                }
                temporal = temporal.getSiguiente();
            }
            if (encontrado == false) {
                //System.out.println("Numero no encontrado!!!");
            }
        }
    }

    // Metodo para imprimir los datos de una persona
    public void imprimirDatos() {
        if (listaVacia() == true) {
            System.out.println("La lista actualmente esta vacia !!!");
        } else {
            // Se crear un nuevo nodo, llamado temporal
            NodoLista temporal;
            // Se le agrega los valores del nodo inicio
            temporal = inicio;
            // Mientras el nodo temporal sea diferente de null, siga ejecutando
            while (temporal != null) {
                // Se procede a imprimir los datos del usuario de la clase persona con el metodo
                // toString
                System.out.println(temporal.getNumero());
                // Mientras se ejecute el while, la variable temporal va a tomar los datos del
                // siguiente nodo
                temporal = temporal.getSiguiente();
            }
        }
    }

}
