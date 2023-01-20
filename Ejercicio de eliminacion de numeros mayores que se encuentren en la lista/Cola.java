class Cola {
    private Nodo inicioCola;
    private Nodo finCola;
    int tamañoCola;

    public Cola() {
        inicioCola = null;
        finCola = null;
        tamañoCola = 0;
    }

    // Metodo para saber si la cola esta vacia
    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    // Método para insertar a la cola
    public void insertar(int numeroIngresar) {
        Nodo nuevo = new Nodo(numeroIngresar);
        if(colaVacia()==true){
            inicioCola = nuevo;
        }else{
            finCola.nodoSiguiente = nuevo;
        }
        finCola = nuevo;
        tamañoCola++;
    }

    // Metodo para extraer de la cola
    public int extraerNumero() {
        if (!colaVacia()) {
            int nuevo_numero = inicioCola.numeroAleatorio;
            if (inicioCola == finCola) {
                inicioCola = null;
                finCola = null;
            } else {
                inicioCola = inicioCola.nodoSiguiente;
            }
            tamañoCola--;
            return nuevo_numero;
        } else {
            return 0;
        }
    }

    // Metodo para imprimir todos los datos de la Cola
    public void imprimirCola() {
        Nodo recorrido = inicioCola;
        System.out.print("[ ");
        while(recorrido != null){
            System.out.print( recorrido.numeroAleatorio + " ");            
            recorrido = recorrido.nodoSiguiente;
        }
        System.out.print(" ]");
    }

    //Metodo para imprimir el tamaño de la Cola
    public int tamañoCola(){
        return tamañoCola;
    }

    //Metodo para saber el primer dato de la cola
    public int primerDatoCola(){
        return inicioCola.numeroAleatorio;
    }
}