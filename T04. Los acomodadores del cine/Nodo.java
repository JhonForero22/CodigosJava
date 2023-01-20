//Se crea la clase Nodo
public class Nodo {
    //Atributos de la clase Nodo, 
    Persona persona;
    Nodo nodoSiguiente;

    //Constructor de la clase Nodo
    public Nodo(Persona nuevaPersona) {
        this.persona = nuevaPersona;
        this.nodoSiguiente = null;
    }

    public Nodo(){

    }
}
