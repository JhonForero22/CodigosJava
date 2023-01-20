//Clae Pila
public class Pila {

    // Atributos clase Pila
    private NodoPila cima;
    int tamaño;

    // Constructor clase Pila
    public Pila() {
        // Se inicio cima con el dato de null
        this.cima = null;
        // El tamaño de la Pila es 0 al inicio
        this.tamaño = 0;
    }

    // Metodo validar que no haya ingresado ya la cedula
    public boolean verificarPersona(int cedula) {
        // Se crea la variable boolena cedularIngresada y se inicia en false
        boolean cedulaYaIngresada = false;
        // Se crear un nuevo nodo, llamado temporal
        NodoPila temporal;
        // Se le agrega los valores del nodo inicio
        temporal = cima;
        // Mientras el nodo temporal sea diferente de null, siga ejecutando
        while (temporal != null) {
            // Si la cedula ingresada en el metodo es igual al valor de la cedula de alguna
            // persona dentro del nodo
            if (cedula == temporal.getPersona().getCedula()) {
                // Cambie el valor de la variable booleana a true
                cedulaYaIngresada = true;
            }
            // Mientras se ejecute el while, la variable temporal va a tomar los datos del
            // siguiente nodo
            temporal = temporal.getSiguiente();
        }
        // Retornar el booleana que haya dado cedulaYaIngresada
        return cedulaYaIngresada;
    }

    // Metodo para saber cuando la Pila esta vacia
    public boolean pilaVacia() {
        // Si el nodo cima es igual a null
        if (cima == null) {
            // Retorna true, indicando que el nodo esta vacio
            return true;
            // Si no
        } else {
            // Retornamos false, indicando que el nodo tiene datos
            return false;
        }
    }

    // Metodo para empujar (push) un elemento de una Pila
    public void push(Persona ingresoPersona) {
        // Se crea un nuevo metodo llamado nuevo, con los datos ingresados en el metodo
        NodoPila nuevo = new NodoPila(ingresoPersona);
        // En el nodo nuevo siguiente procedemos a almacenar al nodo cima
        nuevo.siguiente = cima;
        // Luego procedemos a sobreescribir el nodo cima, con el valor del nodo nuevo
        cima = nuevo;
        // Se aumenta la variable tamaño de la Pila
        tamaño++;
    }

    // Metodo para sacar (pop) un elemento en la Pila
    public Persona pop() {
        // Se crea una variable entera llamada auxiliar, la cual se le agrega el dato
        // que tenga el nodo cima
        Persona personaAuxiliar = cima.persona;
        // Luego se procede a sobreescribir el nodo cima, con el siguiente
        cima = cima.siguiente;
        // Se disminuye la variable tamaño de la Pila
        tamaño--;
        // Se retorna la variable auxliiar
        return personaAuxiliar;
    }

    // Metodo para saber quien esta en la cima de la Pila
    public Persona cima() {
        // Se retorna el dato de la cima
        return cima.persona;
    }

    // Metodo para saber el tamaño de la Pila
    public int tamanoPila() {
        // Se retorna el tamaño de la Pila
        return tamaño;
    }

    // Limpiar Pila
    public void limpiarPila() {
        // Mientras el resultado de PilaVacia sea igual a false
        // Si tiene datos el Nodo
        while (pilaVacia() == false) {
            // Se va borrando o sacando el elemento
            pop();
        }
    }
}