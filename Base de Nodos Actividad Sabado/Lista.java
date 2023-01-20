
public class Lista {
    // Creamos un nodo Inicio y otro Fin
    private Nodo Inicio;
    private Nodo Ultimo;

    // Creamos el constructor de la lista e indicamos que la lista incia en Null y
    // el fin en null
    public Lista() {
        Inicio = null;
        Ultimo = null;
    }

    // Metodo para identificar si la lista esta vacia
    public boolean listaVacia() {
        if (Inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    // Creamos un metodo donde se ingresaran los datos a la lista
    // Y que riciba un Objeto tipo persona
    public void insertarLista(Persona persona) {
        Nodo nuevo;// Nodo nuevo, el primero o inicio
        // Miramos que la lista este vacia o no
        if (listaVacia() == true) {
            // Se procede a guardar en la variable nuevo
            // Un nuevo nodo que reiba un objeto persona y su sigueinte dato que es null
            nuevo = new Nodo(persona, null);
            // Como es el primero decimos que inicia y termina en el nuevo
            Inicio = nuevo;
            Ultimo = nuevo;
            // En caso de que la persona no sea la primera ingrese por este camino
        } else {
            // Se crea un nuevo Nodo, que reciba la persona y el dato null y lo lleve al
            // ultimo
            nuevo = new Nodo(persona, null);
            // Ultio se va a mover
            // Esamen los metodos de setSiguiente para agregarlo al valor siguiente del
            // ultimo
            Ultimo.setSiguiente(nuevo);
            // Se actualiza la referencia y se dice que va a ser el ultimo
            Ultimo = nuevo;
        }
    }

    // Metodos para mostrar la informacion de la lista
    public void mostrarLista() {
        // Condicional por si la lista esta vacia
        if (listaVacia() == true) {
            // Imprimimos el mensaje si la lista esta vacia
            System.out.println("La lista actualmente esta vacia!!!");
        }
        // Si no se cumple, procede a imprimir todos los datos de la lista
        else {
            // Creamos un nuevo Nodo y lo iniciamos desde el Inicion
            Nodo prueba;
            prueba = Inicio;
            // Mientras prueba no sea null se va a cumplir el ciclo
            while (prueba != null) {
                // Se procede a imprimir la informacion de prueba
                // Se conecta con el metodo del Nodo de mostrar Persona
                // Y por ultimo se conecta con el metodo de Persona toString de imprimir toda la
                // informacion
                System.out.println(prueba.getPersona().toString());
                // Prueba pasa al sigueinte nodo para verifica si se imprime o no
                prueba = prueba.getSiguiente();
            }
        }
    }

    // Metodo para buscar con algun dato en la lista de nodos
    public void buscarDato(int cedula) {
        // Condicional por si la lista esta vacia
        if (listaVacia() == true) {
            // Imprimimos el mensaje si la lista esta vacia
            System.out.println("La lista actualmente esta vacia!!!");
        }
        // Si no se cumple, procede a imprimir todos los datos de la lista
        else {
            // Creamos un nuevo Nodo y lo iniciamos desde el Inicion
            Nodo prueba;
            prueba = Inicio;
            boolean encontrado = false;
            // Mientras prueba no sea null se va a cumplir el ciclo
            while (prueba != null) {
                // Si el nuemro ingresado es igual a algun de los del nodo entra s
                if (cedula == prueba.getPersona().getCedula()) {
                    // Se procede a imprimir la informacion de prueba
                    // Se conecta con el metodo del Nodo de mostrar Persona
                    // Y por ultimo se conecta con el metodo de Persona toString de imprimir toda la
                    // informacion
                    System.out.println(prueba.getPersona().toString());
                    encontrado = true;
                }
                // Prueba pasa al sigueinte nodo para verifica si se imprime o no
                prueba = prueba.getSiguiente();
            }
            if (encontrado == false) {
                System.out.println("Usuario no encontrado !!!");
            }
        }
    }
}
