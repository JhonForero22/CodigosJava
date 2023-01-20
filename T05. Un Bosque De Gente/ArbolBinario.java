public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Metodo Insertar un nodo en el arbol
    public void agregarDato(Persona personaA) {
        raiz = agregarDatoRecursivo(raiz, personaA);
    }

    private NodoArbol agregarDatoRecursivo(NodoArbol actual, Persona personaA) {
        if (actual == null) {
            return new NodoArbol(personaA);
        }

        int comparacionNombre = personaA.getCedula().compareTo(actual.getPersona().getCedula());

        if (comparacionNombre <= 0) {
            actual.hijoIzquierdo = agregarDatoRecursivo(actual.hijoIzquierdo, personaA);
        } else {
            actual.hijoDerecho = agregarDatoRecursivo(actual.hijoDerecho, personaA);
        }
        return actual;
    }

    // Metodo Recorrer el arbol InOrden
    public void mostrarInOrden(NodoArbol nodo) {
        if (nodo != null) {
            mostrarInOrden(nodo.hijoIzquierdo);
            mostraDato(nodo.getPersona());
            mostrarInOrden(nodo.hijoDerecho);
        }
    }

    // Metodo para mostrar el valor del nodo
    private void mostraDato(Persona personaA) {
        System.out.print("\n " + personaA.toString());
        System.out.println();
    }

    // Metodo para clonar Arbol
    public NodoArbol cloneArbol(NodoArbol Original) {
        if(Original == null){
            return null;
        }
        NodoArbol copiaOriginal = new NodoArbol(Original.getPersona());
        copiaOriginal.hijoIzquierdo = cloneArbol(Original.hijoDerecho);
        copiaOriginal.hijoDerecho = cloneArbol(Original.hijoIzquierdo);
        return copiaOriginal;
    }

}
