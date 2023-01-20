import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Metodo para ver si el arbol esta vacio
    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }
    
    // Metodo Insertar un nodo en el arbol
    public void agregarDato(Persona personaA) {
        raiz = agregarDatoRecursivo(raiz, personaA);
    }

    private NodoArbol agregarDatoRecursivo(NodoArbol actual, Persona personaA) {
        if (actual == null) {
            return new NodoArbol(personaA);
        }
        int comparacionNombre = personaA.getNombre().compareTo(actual.getPersona().getNombre());
        if (comparacionNombre <= 0) {
            actual.hijoIzquierdo = agregarDatoRecursivo(actual.hijoIzquierdo, personaA);
        } else {
            actual.hijoDerecho = agregarDatoRecursivo(actual.hijoDerecho, personaA);
        }
        return actual;
    }

    // Metodo para mostrar el valor del nodo
    private void mostraDato(Persona personaA){
        System.out.print(" "+personaA.getNombre());
    }

    //Metodo para saber cuantos nodos hay en el arbol
    public int getSize(){
        return getSizeRecursivo(raiz);
    }

    private int getSizeRecursivo(NodoArbol actual){
        return actual == null 
        ? 0 
        : getSizeRecursivo(actual.hijoIzquierdo) + 1 + getSizeRecursivo(actual.hijoDerecho); 
    }

    // Metodo para buscar un nodo en el arbol
    public boolean buscarValor(String nombreBuscar){
        return buscarValorRecursivo(raiz, nombreBuscar);
    }

    private boolean buscarValorRecursivo(NodoArbol actual, String nombreBuscar){
        if(actual == null){
            return false;
        }
        if ( nombreBuscar.equals(actual.getPersona().getNombre())){
            return true;
        }

        return nombreBuscar.compareTo(actual.persona.getNombre()) < 0
        ? buscarValorRecursivo(actual.hijoIzquierdo, nombreBuscar)
        : buscarValorRecursivo(actual.hijoDerecho, nombreBuscar);
    }

    // Metodo eliminar un nodo en el arbol
    public void eliminar(String nombre){
        raiz = eliminarRecursivo(raiz, nombre);
    }

    private NodoArbol eliminarRecursivo(NodoArbol actual, String nombre){
        if(actual == null){
            return null;
        }

        if(nombre.equals(actual.getPersona().getNombre())){
            //Caso 1
            if(actual.hijoIzquierdo == null && actual.hijoDerecho == null){
                return null;
            }

            //Caso 2
            if(actual.hijoDerecho == null){
                return actual.hijoIzquierdo;
            }

            if(actual.hijoIzquierdo == null){
                return actual.hijoDerecho;
            }

            //Caso 3
            String valorPequeño = valorMasPequeño(actual.hijoDerecho);
            actual.getPersona().setNombre(valorPequeño);
            actual.hijoDerecho = eliminarRecursivo(actual.hijoDerecho, valorPequeño);
            return actual;
        }

        if(nombre.compareTo(actual.persona.getNombre()) < 0){
            actual.hijoIzquierdo = eliminarRecursivo(actual.hijoIzquierdo, nombre);
            return actual;
        }

        actual.hijoDerecho = eliminarRecursivo(actual.hijoDerecho, nombre);
            return actual;
    }

    private String valorMasPequeño(NodoArbol raiz){
        return raiz.hijoIzquierdo == null ? raiz.getPersona().getNombre() : valorMasPequeño(raiz.hijoIzquierdo);
    }


    // Metodo Recorrer el arbol InOrden
    public void mostrarInOrden(NodoArbol nodo){
        if(nodo != null){
            mostrarInOrden(nodo.hijoIzquierdo);
            mostraDato(nodo.getPersona());
            mostrarInOrden(nodo.hijoDerecho);
        }
    }

    // Metodo Recorrer el arbol PreOrden
    public void mostrarPreOrder(NodoArbol nodo) {
        if (nodo != null) {
            mostraDato(nodo.getPersona());
            mostrarPreOrder(nodo.hijoIzquierdo);
            mostrarPreOrder(nodo.hijoDerecho);
        }
    }

    // Metodo Recorrer el arbol PostOrden
    public void mostrarPostOrder(NodoArbol nodo) {
        if (nodo != null) {
            mostrarPostOrder(nodo.hijoIzquierdo);
            mostrarPostOrder(nodo.hijoDerecho);
            mostraDato(nodo.getPersona());
        }
    }

    // Metodo Recorrer el arbol por nivel
    public void mostrarPorNivel(){
        if (raiz == null){
            return;
        }
        
        Queue<NodoArbol> nodoQueue = new LinkedList<>();
        nodoQueue.add(raiz);

        while(!nodoQueue.isEmpty()){
            NodoArbol nodo = nodoQueue.remove();
            System.out.print(" " + nodo.getPersona().getNombre());

            if(nodo.hijoIzquierdo != null){
                nodoQueue.add(nodo.hijoIzquierdo);
            }
            if(nodo.hijoDerecho != null){
                nodoQueue.add(nodo.hijoDerecho);
            }
        }
    }
}
