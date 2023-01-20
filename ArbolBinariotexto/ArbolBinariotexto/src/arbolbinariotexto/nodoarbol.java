package arbolbinariotexto;

public class nodoarbol {

    String nombre;
    nodoarbol hizquierdo, hderecho;

    public nodoarbol(String nom) {
        this.nombre = nom;
        this.hizquierdo = null;
        this.hderecho = null;
    }

    public String toString() {
        return "\n El nombre del nodo es: " + nombre;
    }
}
