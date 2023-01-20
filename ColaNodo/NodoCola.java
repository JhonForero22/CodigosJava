//Clase Nodo
public class NodoCola {

    // Atributos de la clase Nodo
    // Dato que va a almacenar y el siguiente nodo que va a hacer la conexion
    int dato;
    NodoCola nodoSiguiente;

    // Construcotr de la clase Nodo
    public NodoCola(int datoN) {
        // Se almacenan los datos ingresados en el metodo
        this.dato = datoN;
        this.nodoSiguiente = null;
    }

}
