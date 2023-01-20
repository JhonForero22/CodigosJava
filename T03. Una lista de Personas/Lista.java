//Clase lista
public class Lista<E> {
    // Atributos clase lista
    private Nodo<E> inicio;
    private Nodo<E> fin;
    private int numElem;

    // Constructor clase lista
    // Con los variables inicio y fin del nodo
    // Y la cantidad de datos que lleva el nodo
    public Lista() {
        inicio = null;
        fin = null;
        numElem = 0;
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
    public void insertarDato(Persona persona) {
        // Crea un nuevo Nodo
        Nodo<E> nuevo;
        // Veririfica si la lista esta vacia
        if (listaVacia() == true) {
            // Como la lista esta vacia
            // Se crear un nuevo Nodo y se le asgina a la variable Nodo nuevo
            nuevo = new Nodo<>(null, persona);
            // Como es el primero, se le agrega a nuevo y fin, porque solo hay 1
            inicio = nuevo;
            fin = nuevo;
            // Se aumenta el contador de los datos dentro del nodo
            numElem++;
            // Si la lista noi esta vacia, tiene mas de un dato
        } else {
            // Se procede a crear un nuevo Nodo con los datos y se guarda en la variable
            // Nodo nuevo
            nuevo = new Nodo<>(null, persona);
            // Se procede a decir al nodo fin, que en el campo siguiente guarde el nuevo
            // nodo que ingreso
            fin.setSiguiente(nuevo);
            // Se guarda en la variable fin el nuevo Nodo agregado
            fin = nuevo;
            // Se aumenta el contador
            numElem++;
        }
    }

    // Metodo para verificar si la persona esta en el nodo y no agregar otro con la
    // misma cedula
    public boolean verificarPersona(int cedula) {
        // Se crea la variable boolena cedularIngresada y se inicia en false
        boolean cedulaYaIngresada = false;
        // Si la lista esta vacia
        if (listaVacia() == true) {
            // Se imprime el mensaje
            System.out.println("La lista actualmente esta vacia !!!");
            // De lo contrario
        } else {
            // Se crear un nuevo nodo, llamado temporal
            Nodo<E> temporal;
            // Se le agrega los valores del nodo inicio
            temporal = inicio;
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
        }
        // Retornar el booleana que haya dado cedulaYaIngresada
        return cedulaYaIngresada;
    }

    // Metodo para imprimir los datos de una persona
    public void imprimirDatos() {
        // Si la lista esta vacia
        if (listaVacia() == true) {
            // Se imprime el mensaje
            System.out.println("La lista actualmente esta vacia !!!");
            // De lo contrario
        } else {
            // Se crear un nuevo nodo, llamado temporal
            Nodo<E> temporal;
            // Se le agrega los valores del nodo inicio
            temporal = inicio;
            // Mientras el nodo temporal sea diferente de null, siga ejecutando
            while (temporal != null) {
                // Se procede a imprimir los datos del usuario de la clase persona con el metodo
                // toString
                System.out.println(temporal.getPersona().toString());
                // Mientras se ejecute el while, la variable temporal va a tomar los datos del
                // siguiente nodo
                temporal = temporal.getSiguiente();
            }
        }
    }

    // Metodo para buscar una persona dentro del nodo y devolver su informacion
    public void buscarPersona(int cedula) {
        // Si la lista esta vacia
        if (listaVacia() == true) {
            // Se imprime el mensaje
            System.out.println("La lista actualmente esta vacia !!!");
            // De lo contrario
        } else {
            // Se crear un nuevo nodo, llamado temporal
            Nodo<E> temporal;
            // Se le agrega los valores del nodo inicio
            temporal = inicio;
            // Se crea una variable booleana llamada encontrado con un valor de false
            boolean encontrado = false;
            // Mientras temporal sea diferente de null
            while (temporal != null) {
                // Si la cedula ingresada en el metodo es igual a la cedula del nodo temporal
                if (cedula == temporal.getPersona().getCedula()) {
                    // Se procede a imprimir los datos del usuario de la clase persona con el metodo
                    // toString
                    System.out.println(temporal.getPersona().toString());
                    // Se cambia el valor de la variable encontado de true
                    encontrado = true;
                }
                // Mientras se ejecute el while, la variable temporal va a tomar los datos del
                // siguiente nodo
                temporal = temporal.getSiguiente();
            }
            // Si encontrado es igual a false
            if (encontrado == false) {
                // Imprima el siguiente mensaje
                System.out.println("Usuarion no encontrado!!!");
            }
        }
    }

    // Metodo para buscar una persona devuelve true or false
    // Conectado con el metodo de eliminarPersona
    public boolean buscarPersonaTrueorFalse(int cedula) {
        // Se crear un nuevo nodo, llamado temporal
        Nodo<E> temporal;
        // Se le agrega los valores del nodo inicio
        temporal = inicio;
        // Se crea una variable booleana llamada encontrado con un valor de false
        boolean encontrado = false;
        // Mientras temporal sea diferente de null
        while (temporal != null) {
            // Si la cedula ingresada en el metodo es igual a la cedula del nodo temporal
            if (cedula == temporal.getPersona().getCedula()) {
                // Se procede a imprimir los datos del usuario de la clase persona con el metodo
                // toString
                System.out.println(temporal.getPersona().toString());
                // Se cambia el valor de la variable encontado de true
                encontrado = true;
            }
            // Mientras se ejecute el while, la variable temporal va a tomar los datos del
            // siguiente nodo
            temporal = temporal.getSiguiente();
        }
        // Retorna el valor de la varialble encontrado true or false
        return encontrado;
    }

    // Metodo para eliminar una persona del Nodo
    public void eliminarPersona(int cedula) {
        // Sila lista esta diferente de vacia
        if (!listaVacia()) {
            // Si la persona se encuentra dentro de las persona del nodo ingrese
            if (buscarPersonaTrueorFalse(cedula) == true) {
                // Si el nodo Inicio y el nodo igual tiene los mismo valires Y el valor dato
                // ingresado en el metodo es igual
                // al valor de la cedula del nodo
                if (inicio == fin && cedula == inicio.getPersona().getCedula()) {
                    //Inicio y din si igualan a null porque el nodo esta vacia sin datos
                    inicio = fin = null;
                    //Si la cedula es igual a el el primer nodo 
                } else if (cedula == inicio.getPersona().getCedula()) {
                    //El valor del nodo inicio se borrar y ahora es el siguiente
                    inicio = inicio.getSiguiente();
                    //Si no se cumple ninguna de las dos condiciones
                } else {
                    // Se crear un nuevo nodo, llamado anteriror
                    Nodo<E> anterior;
                    // Se crear un nuevo nodo, llamado temporal
                    Nodo<E> temporal;
                    //Se le asigna el valor de inicio a anterior
                    anterior = inicio;
                    //Se le asigna el valor de el siguiente nodo de inicion a la variable temporal
                    temporal = inicio.getSiguiente();
                    
                    //Mientras la variable nodo temporal sea diferente de null 
                    // Y el nodo temporal sea diferente al dato de cedula ingresado en el metodo 
                    while (temporal != null && temporal.getPersona().getCedula() != cedula) {
                        //Ejecute esto
                        //La variable nodo anteriror y temporal, iran siguiendo a el nodo que les corresponda
                        anterior = anterior.getSiguiente();
                        temporal = temporal.getSiguiente();
                    }
                    
                    //Si la variable null llega a ser diferente de null solamente
                    if (temporal != null) {
                        //El nodo anterior procede a almacenar el valor siguiente del nodo temporal
                        anterior.setSiguiente(temporal.getSiguiente());
                        // Si la variable nodo temporal llega a ser el mismo valor de el ultimo nodo fin
                        if (temporal == fin) {
                            // Ejecute este codigo
                            //La variable nodo fin se le asignanra el valor que tenga el nodo anterior
                            fin = anterior;
                        }
                    }
                }
                // Se imprime el mensaje diciendo que la persona fue eliminada del nodo
                System.out.println("Persona eliminada correctamente!!!");
                // De lo contrario si no se encuentra la cedula
            } else {
                // Se imprime el mensaje
                System.out.println("Usuario NO encontrado !!!");
            }
            // De lo contrario si es diferente a listaVacia
        } else {
            // Imprima este mensaje
            System.out.println("Lista vacia !!!");
        }
    }

    // Metodo para limpiar pantalla
    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}