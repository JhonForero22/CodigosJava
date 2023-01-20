//Clase Nodo
public class NodoCola {

    // Atributos de la clase Nodo
    // Dato que va a almacenar y el siguiente nodo que va a hacer la conexion
    Persona persona;
    NodoCola nodoSiguiente;

    // Construcotr de la clase Nodo
    public NodoCola(Persona nuevoPersona) {
        // Se almacenan los datos ingresados en el metodo
        this.persona = nuevoPersona;
        this.nodoSiguiente = null;
    }

}
