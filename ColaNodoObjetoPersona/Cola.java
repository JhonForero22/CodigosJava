//Clase cola
public class Cola {

    // Atributos clase Cola, se define un inicio y un fin respecto al tamaño del
    // nodo
    // Tambien se procede a crear una variable para llevar la cantidad de datos
    // dentro de la Cola
    NodoCola inicio, fin;
    int tamañoNodoCola;

    //Se crea el constructor de la Clase Cola
    public Cola() {
        inicio = fin = null;
        tamañoNodoCola = 0;
    }

    //Metodo para saber si la Cola esta vacia
    public boolean estaVacia() {
        //Si inicio es igual a null
        if (inicio == null) {
            //Retorna true, indicando que la Cola esta vacia
            return true;
            //Si no
        } else {
            //Retorna false, indicando que la Cola tiene datos
            return false;
        }
    }

    //Metodo insertar un elemento dentro de la Cola
    public void insertar(Persona nuevaPersona) {
        //Se procede a crear el nuevo nodo que almacenera el dato ingresado en el Nodo
        NodoCola nuevo = new NodoCola(nuevaPersona);
        //Si la lista esta vacia entonces
        if (estaVacia() == true) {
            //Se procede a guardar el nuevo nodo como el inicion
            inicio = nuevo;
            //Si no
        } else {
            //Se procede a agregar el avlor del nuevo nodo, en el nodo siguientes del final
            fin.nodoSiguiente = nuevo;
        }
        //El nodo fin siempre se va a almacenar con con el valor del nodo nuevo
        fin = nuevo;
        //Se aumenta el contador indicando que se infreso un dato
        tamañoNodoCola++;
    }

    //Metodo para quitar un dato de la Cola
    public Persona quitar() {
        //Se observa que la litsta no este vacia
        if(!estaVacia()){
            //Se crea una nueva persona del objeto Persona, el cual va a tener la informacion del inicioCola
            Persona nuevaPersona = inicioCola();
            //Si el inicio de la cola es igual al final
            if(inicio==fin){
                //Los nodos inicio y fin se igualan a null
                inicio = null;
                fin = null;
                //Si no
            }else{
                //Si no el nodo inicio pase a tener el valor del siguiente Nodo
                inicio = inicio.nodoSiguiente;
            }
            //Se disminuye la cantidad de datos que hay en la cola
            tamañoNodoCola--;
            //Se retorna el valor de la nuevaPersona
            return nuevaPersona;
            //Si la lista no tiene datos
        }else{
            //Retorna null
            return null;
        }
    }

    //Metodo para devolver el dato que contiene el inicio de la Cola
    public Persona inicioCola() {
        //Retorna el dato del primer Nodo
        return inicio.persona;
    }

    //Metodo para calcular el tamaño de la Cola
    public int tamañoCola() {
        //Se retorna el valor del tamaño de Cola
        return tamañoNodoCola;
    }

    //Metodo para imprimir todos los datos de la Cola 
    public void imprimirCola() {
        //Se crea una variable i la cual se inicia en 1
        int i = 1;
        //Se crea un Nodo temporal
        NodoCola temporal;
        //La variable Nodo = obtendra los mismos datos que tiene el Nodo inicio
        temporal = inicio;
        //Mintras el nodo temporal siguiente sea difente a null
        while (temporal != null) {
            //Se imprime un mensaje con todos los nodos
            System.out.println("Elemento de la cola N" + i + " ,tiene la informacion: " + temporal.persona.toString());
            //Se indica que el nodo temporal valla avanzando
            temporal = temporal.nodoSiguiente;
            //Se aumenta la variable u
            i++;
        }
    }

}
