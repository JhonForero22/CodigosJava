public class listaNombres {
            
    private Nodo inicio;
    
    public listaNombres(){
        inicio = null;
    }

    public void insterInicioNodo(String nombre){
        Nodo nuevo = new Nodo (nombre,inicio);
        inicio = nuevo;
        System.out.println("Ingresado al Inicio");
    }

    public void insertarFinal(String nombre){
        Nodo nuevo = new Nodo (nombre,null);
        if(inicio==null){
            inicio = nuevo;
        }else{
            Nodo actual = inicio;
            while( actual.getSiguiente()!=null){
                actual = actual.getSiguiente();
            }
            actual.getSiguiente();
        }
        System.out.println("Ingresado al Final");
    }

    public void listar(){
    
        Nodo actual = inicio;
        while (actual.getSiguiente()!= null){
            System.out.println(actual.getNombre());
            actual = actual.getSiguiente();
        }
        System.out.println(actual.getNombre());
    }
}
