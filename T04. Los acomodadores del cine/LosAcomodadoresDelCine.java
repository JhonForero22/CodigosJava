/*
 Ultima vez modificado 20/10/2022
*/
public class LosAcomodadoresDelCine {
    public static void main(String[] args) {
        int edadAleatotio = 0;
        Cola listaNumero1 = new Cola();
        Cola listaNumero2 = new Cola();
        Cola listaOrdenada = new Cola();

        //Variable para definir el numero de personas dentro de la Fila
        int numeroPersonas = 5;

        /*
        Scanner eScanner = new Scanner(System.in);
        System.out.println("Bienvenido!!!");
        System.out.print("Ingrese la cantidad de persona que va a tener la fila: ");
        numeroPersonas = eScanner.nextInt();
        eScanner.close(); 
         */

        String nombreUsuario;

        for (int i = 0; i < numeroPersonas; i++) {
            edadAleatotio = (int) ((Math.random()) * 100) + 1;
            if (edadAleatotio >= 18 && edadAleatotio <= 99) {
                nombreUsuario = "Usuario" + (i + 1);
                listaNumero1.insertar(new Persona(edadAleatotio, nombreUsuario));
            } else {
                i--;
            }
        }

        for (int i = 0; i < numeroPersonas; i++) {
            edadAleatotio = (int) ((Math.random()) * 100) + 1;
            if (edadAleatotio >= 18 && edadAleatotio <= 99) {
                nombreUsuario = "Usuario" + (i + 1);
                listaNumero2.insertar(new Persona(edadAleatotio, nombreUsuario));
            } else {
                i--;
            }
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Lista de personas 1");
        listaNumero1.imprimirCola();
        System.out.println("-----------------------------------");
        System.out.println("Lista de personas 2");
        listaNumero2.imprimirCola();
        System.out.println("-----------------------------------");
       
        while (listaNumero1.tamañoCola() != 0 || listaNumero2.tamañoCola() != 0) {
            int edadLista1, edadLista2;

            if (listaNumero1.tamañoCola() == 0) {
                edadLista1 = 0;
            } else {
                edadLista1 = listaNumero1.primerDatoCola().getEdad();
            }

            if (listaNumero2.tamañoCola() == 0) {
                edadLista2 = 0;
            } else {
                edadLista2 = listaNumero2.primerDatoCola().getEdad();
            }
            if (edadLista1 >= edadLista2) {
                listaOrdenada.insertar(listaNumero1.primerDatoCola());
                listaNumero1.extraerPersona();
            } else {
                listaOrdenada.insertar(listaNumero2.primerDatoCola());
                listaNumero2.extraerPersona();
            }
        }

        System.out.println("Lista Organizada!!!");
        listaOrdenada.imprimirCola();
        System.out.println("-----------------------------------");
    }
}

class Persona {
    String nombre;
    int edad;

    public Persona(int Nedad, String Nnombre){
        this.edad = Nedad;
        this.nombre = Nnombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona "+
        "[nombre=" + nombre + 
        ", edad=" + edad + "]";
    }

}

class Nodo {
    Persona persona;
    Nodo nodoSiguiente;

    public Nodo(Persona nuevaPersona) {
        this.persona = nuevaPersona;
        this.nodoSiguiente = null;
    }

    public Nodo(){

    }
}

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
    public void insertar(Persona personIngresar) {
        Nodo nuevo = new Nodo(personIngresar);
        if(colaVacia()==true){
            inicioCola = nuevo;
        }else{
            finCola.nodoSiguiente = nuevo;
        }
        finCola = nuevo;
        tamañoCola++;
    }

    // Metodo para extraer de la cola
    public Persona extraerPersona() {
        if (!colaVacia()) {
            Persona nuevo_persona = inicioCola.persona;
            if (inicioCola == finCola) {
                inicioCola = null;
                finCola = null;
            } else {
                inicioCola = inicioCola.nodoSiguiente;
            }
            tamañoCola--;
            return nuevo_persona;
        } else {
            return null;
        }
    }

    // Metodo para imprimir todos los datos de la Cola
    public void imprimirCola() {
        Nodo recorrido = inicioCola;

        while(recorrido != null){
            System.out.println(recorrido.persona.toString());
            recorrido = recorrido.nodoSiguiente;
        }

        /*Nodo temporal;
        temporal = inicioCola;
        while (temporal.nodoSiguiente != null) {
            System.out.println(temporal.persona.toString());
            temporal = temporal.nodoSiguiente;
        }*/
    }

    //Metodo para imprimir el tamaño de la Cola
    public int tamañoCola(){
        return tamañoCola;
    }

    //Metodo para saber el primer dato de la cola
    public Persona primerDatoCola(){
        return inicioCola.persona;
    }
}
