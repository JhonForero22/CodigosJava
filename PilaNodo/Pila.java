//Clae Pila
public class Pila {

    //Atributos clase Pila
    private NodoPila cima;
    int tamaño;

    //Constructor clase Pila
    public Pila() {
        //Se inicio cima con el dato de null
        this.cima = null;
        //El tamaño de la Pila es 0 al inicio
        this.tamaño = 0;
    }

    // Metodo para saber cuando la Pila esta vacia
    public boolean pilaVacia() {
        //Si el nodo cima es igual a null
        if (cima == null) {
            //Retorna true, indicando que el nodo esta vacio
            return true;
            //Si no
        } else {
            //Retornamos false, indicando que el nodo tiene datos
            return false;
        }
    }

    // Metodo para empujar (push) un elemento de una Pila
    public void push(int elemento) {
        //Se crea un nuevo metodo llamado nuevo, con los datos ingresados en el metodo
        NodoPila nuevo = new NodoPila(elemento);
        // En el nodo nuevo siguiente procedemos a almacenar al nodo cima
        nuevo.siguiente = cima;
        // Luego procedemos a sobreescribir el nodo cima, con el valor del nodo nuevo
        cima = nuevo;
        // Se aumenta la variable tamaño de la Pila
        tamaño++;
    }

    //Metodo para sacar (pop) un elemento en la Pila
    public int pop(){
        // Se crea una variable entera llamada auxiliar, la cual se le agrega el dato que tenga el nodo cima
        int auxiliar = cima.dato;
        // Luego se procede a sobreescribir el nodo cima, con el siguiente
        cima = cima.siguiente;
        // Se disminuye la variable tamaño de la Pila
        tamaño--;
        //Se retorna la variable auxliiar 
        return auxiliar;
    }

    //Metodo para saber quien esta en la cima de la Pila
    public int cima(){
        //Se retorna el dato de la cima
        return cima.dato;
    }

    //Metodo para saber el tamaño de la Pila
    public int tamanoPila(){
        //Se retorna el tamaño de la Pila
        return tamaño;
    }

    //Limpiar Pila
    public void limpiarPila(){
        //Mientras el resultado de PilaVacia sea igual a false
        //Si tiene datos el Nodo
        while(pilaVacia()==false){
            //Se va borrando o sacando el elemento
            pop();
        }
    }


}
