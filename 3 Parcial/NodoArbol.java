public class NodoArbol {
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;
    int numero;

    public NodoArbol(int Nnumero){
        this.numero = Nnumero;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
