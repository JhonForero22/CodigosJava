public class NodoArbol {
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;
    Persona persona;

    public NodoArbol(Persona personaJ){
        this.persona = personaJ;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
