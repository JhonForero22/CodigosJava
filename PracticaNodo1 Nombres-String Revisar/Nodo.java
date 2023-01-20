public class Nodo {

    private String nombre;
    private Nodo siguiente;

    public Nodo(String nombre, Nodo siguiente) {
        this.nombre = nombre;
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
