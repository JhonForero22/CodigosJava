//Clase NodoPila
public class NodoPila {
    // Atributos de la clase NodoPila
    Persona persona;
    NodoPila siguiente;

    // Constructor
    public NodoPila(Persona nuevaPersona) {
        // Se guardan los datos con el constructor
        this.persona = nuevaPersona;
        siguiente = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

}
