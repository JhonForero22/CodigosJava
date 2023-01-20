public class Nodo {

    //Creamos dos variable 
    // El primero va a ser un tipo la nuestra clase y se va a llamar siguiente
    // Una va a ser un objeto que va a ser Persona de la clase
    private Nodo Siguiente;
    private Persona Persona;

    //Creamos un constructor con las variables que creamos
    public Nodo( Persona persona, Nodo siguiente){
        this.Persona = persona;
        this.Siguiente = siguiente;
    }

    //Generamos los metodos de Getter and setters
    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }
    
}
