//Clase Nodo
public class Nodo<E>{

    //Atributos de la clase nodo
    private Nodo<E> Siguiente;
    private Persona Persona;

    //Constructor clase Nodo
    public Nodo(Nodo<E> siguiente, Persona persona) {
        Siguiente = siguiente;
        Persona = persona;
    }

    //Metodo para ir al siguiente Nodo
    public Nodo<E> getSiguiente() {
        return Siguiente;
    }

    //Metodo para insertar un valor al nodo siguiente
    public void setSiguiente(Nodo<E> siguiente) {
        Siguiente = siguiente;
    }

    //Metodo para devolver la clase persona
    public Persona getPersona() {
        return Persona;
    }

    //Metodo para insertar la persona al nodo
    public void setPersona(Persona persona) {
        Persona = persona;
    }
}