//Creacion de la clase 14
public class Cola {
    // Se crear los datos necesarios mas adelante
    private Nodo inicioCola;
    private Nodo finCola;
    int tamañoCola;

    // Creo el constructor
    public Cola() {
        // Se inicia y finaliza la cola con los valores de null
        // Tambien se coloco un tamañoCola para saber cuantos han sido ingresado
        inicioCola = null;
        finCola = null;
        tamañoCola = 0;
    }

    // Metodo para saber si la cola esta vacia
    public boolean colaVacia() {
        // Si la funcion inicioCola es igual a null
        if (inicioCola == null) {
            // Devuelve true
            return true;
            // Si no
        } else {
            // False
            return false;
        }
    }

    // Método para insertar a la cola
    // Se solicita de la clase Persona
    public void insertar(Persona personIngresar) {
        // Se crea un nuevo nodo llamado nuevo y se almacena el dato persona ingresado
        // en el metodo
        Nodo nuevo = new Nodo(personIngresar);
        // Si la cola esta vacia
        if (colaVacia() == true) {
            // Ingrese el nodo al inicio de la cola
            inicioCola = nuevo;
            // Si no
        } else {
            // En el nodo siguiente del final de la cola se procedia a agregar el nuevo nodo
            finCola.nodoSiguiente = nuevo;
        }
        // De igual forma siempre el ultimo nodo, finCola era igual al nuevo nodo
        finCola = nuevo;
        // Va aumentando el tamaño de cola, es decir aumentan los datos
        tamañoCola++;
    }

    // Metodo para extraer de la cola
    public Persona extraerPersona() {
        // Si la cola es diferente de colaVacia es decir false
        if (!colaVacia()) {
            // Se crea un nuevo dato, tipo clase Persona con un nuevo nombre
            // Y se procede a almacenar ahi el metodo clase persona, que devuelve a la
            // primer persona
            Persona nuevo_persona = inicioCola.persona;
            // Si el dato de inicio de la cola es igual dato del final de la cola
            if (inicioCola == finCola) {
                // Se procede a colocar al nodo inicioCola null y al nodo finCola null
                inicioCola = null;
                finCola = null;
                // Sino
            } else {
                // El nodo inicioCola pasa a ser el siguiente nodo
                inicioCola = inicioCola.nodoSiguiente;
            }
            // Se procede a disminuir el tamaño de la cola
            tamañoCola--;
            // Se retorna la persona eliminada de la Cola
            return nuevo_persona;
            // Si no
        } else {
            // Retorna un null, indicando que la cola esta vacia
            return null;
        }
    }

    // Metodo para imprimir todos los datos de la Cola
    public void imprimirCola() {
        // Se crea un nuevo nodo, llamada recorrido el cual tendra el valor de
        // inicioCola
        Nodo recorrido = inicioCola;
        // Mientras el nodo recorrido tenga un valor diferente a null
        while (recorrido != null) {
            // Imprima el metodo toString de la clase Persona vinculada al nodo
            // recorrido -> Nodo, persona-> Clase toString-> Metodo imprimir
            System.out.println(recorrido.persona.toString());
            // Recorrido va a ir al siguiente nodo cada vez que imprima los datos
            recorrido = recorrido.nodoSiguiente;
        }
    }

    // Metodo para imprimir el tamaño de la Cola
    public int tamañoCola() {
        // Retorna el tamaño que tiene la cola
        return tamañoCola;
    }

    // Metodo para saber el primer dato de la cola
    public Persona primerDatoCola() {
        // Retorna el primer dato al inicio de la Cola
        return inicioCola.persona;
    }
}
