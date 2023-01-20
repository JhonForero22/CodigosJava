public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Metodo Insertar un nodo en el arbol
    public void agregarDato(int Nnumero) {
        raiz = agregarDatoRecursivo(raiz, Nnumero);
    }

    private NodoArbol agregarDatoRecursivo(NodoArbol actual, int Nnumero) {
        if (actual == null) {
            return new NodoArbol(Nnumero);
        }

        if (Nnumero < actual.numero) {
            actual.hijoIzquierdo = agregarDatoRecursivo(actual.hijoIzquierdo, Nnumero);
        } else if (Nnumero > actual.numero) {
            actual.hijoDerecho = agregarDatoRecursivo(actual.hijoDerecho, Nnumero);
        }

        return actual;
    }

    // Busca un valor
    public boolean containsNode(int Nnumero) {
        return containsNodeRecursive(raiz, Nnumero);
    }

    private boolean containsNodeRecursive(NodoArbol actual, int Nnumero) {
        if (actual == null) {
            return false;
        }
        if (Nnumero == actual.numero) {
            return true;
        }

        return Nnumero < actual.numero
                ? containsNodeRecursive(actual.hijoIzquierdo, Nnumero)
                : containsNodeRecursive(actual.hijoDerecho, Nnumero);
    }

    // Metodo Recorrer el arbol InOrden
    public void mostrarInOrden(NodoArbol actual) {
        if (actual != null) {
            mostrarInOrden(actual.hijoIzquierdo);
            mostraDato(actual.numero);
            mostrarInOrden(actual.hijoDerecho);
        }
    }

    // Metodo para mostrar el valor del nodo
    private void mostraDato(int Nnumero) {
        System.out.print("\n " + Nnumero);
        System.out.println();
    }

    // Indica cuantos nodos hay en el arbol
    public int getSize() {
        return getSizeRecursive(raiz);
    }

    private int getSizeRecursive(NodoArbol actual) {
        return actual == null ? 0 : getSizeRecursive(actual.hijoIzquierdo) + 1 + getSizeRecursive(actual.hijoDerecho);
    }

}
