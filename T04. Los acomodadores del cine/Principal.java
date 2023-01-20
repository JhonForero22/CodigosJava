//import java.util.Scanner;
/*
 Ultima vez modificado 20/10/2022
*/
public class Principal {
    public static void main(String[] args) {
        // Se crea la variable edad aleatoria de la persona
        int edadAleatotio = 0;
        // Se crean las lista N1 y N2 y las ordenada de las persona que van a entrar
        Cola listaNumero1 = new Cola();
        Cola listaNumero2 = new Cola();
        Cola listaOrdenada = new Cola();

        // Variable para definir el numero de personas dentro de la Fila
        int numeroPersonas = 5;

        /*
         * Scanner eScanner = new Scanner(System.in);
         * System.out.println("Bienvenido!!!");
         * System.out.print("Ingrese la cantidad de persona que va a tener la fila: ");
         * numeroPersonas = eScanner.nextInt();
         * eScanner.close();
         */

        // Se crea una clase llamada nombreUsuario
        String nombreUsuario;

        // sE Crea un for el cual va a ir en aumentar hasta generar la cantidad de
        // personas establecidas en la fila
        for (int i = 0; i < numeroPersonas; i++) {
            // Se genera un numero aleatorio entre 1 y 100 y se almacena dentro de la
            // variable edadAleatorio
            edadAleatotio = (int) ((Math.random()) * 100) + 1;
            // Si la edadAleatoria es mayor o igual a 18 y la edadAleatoria es menor o igual
            // a 99
            if (edadAleatotio >= 18 && edadAleatotio <= 99) {
                // En la variable nombreUsuario procederemos a guardar Usuario acompañado de un
                // numero
                nombreUsuario = "Usuario" + (i + 1);
                // Luego se procede a llamar a la listaNumero1 el metodo insertar y se crea una
                // Nueva persona clase con los datos que generamos anteriormente
                listaNumero1.insertar(new Persona(edadAleatotio, nombreUsuario));
                // Sino
            } else {
                // Se borrar la persona y se crear otro edadAleatoria hasta que cumpla con la
                // condicion
                i--;
            }
        }

        // sE Crea un for el cual va a ir en aumentar hasta generar la cantidad de
        // personas establecidas en la fila
        for (int i = 0; i < numeroPersonas; i++) {
            // Se genera un numero aleatorio entre 1 y 100 y se almacena dentro de la
            // variable edadAleatorio
            edadAleatotio = (int) ((Math.random()) * 100) + 1;
            // Si la edadAleatoria es mayor o igual a 18 y la edadAleatoria es menor o igual
            // a 99
            if (edadAleatotio >= 18 && edadAleatotio <= 99) {
                // En la variable nombreUsuario procederemos a guardar Usuario acompañado de un
                // numero
                nombreUsuario = "Usuario" + (i + 1);
                // Luego se procede a llamar a la listaNumero1 el metodo insertar y se crea una
                // Nueva persona clase con los datos que generamos anteriormente
                listaNumero2.insertar(new Persona(edadAleatotio, nombreUsuario));
                // Si no
            } else {
                // Se borrar la persona y se crear otro edadAleatoria hasta que cumpla con la
                // condicion
                i--;
            }
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Lista de personas 1");
        //Imprimiendo los datos de la fila1
        listaNumero1.imprimirCola();
        System.out.println("-----------------------------------");
        System.out.println("Lista de personas 2");
        //Imprimiendo los datos de la fila2
        listaNumero2.imprimirCola();
        System.out.println("-----------------------------------");

        // Mientras el tamaño de la lista N1 y N2 sea diferente a 0
        while (listaNumero1.tamañoCola() != 0 || listaNumero2.tamañoCola() != 0) {
            //Se crea dos variable para ir guardando la edad de las personas en la fila
            int edadLista1, edadLista2;

            //Si el tamaño de la lista de la cola 1 llega ser igual a cero
            if (listaNumero1.tamañoCola() == 0) {
                //Procede a colocarle como edad 0
                edadLista1 = 0;
                //Sino
            } else {
                //Procede a ir al metodo primerDatoCola de la lista Numero 1 y trae la edad de la personas
                edadLista1 = listaNumero1.primerDatoCola().getEdad();
            }

            //Si el tamaño de la lista de la cola 2 llega ser igual a cero
            if (listaNumero2.tamañoCola() == 0) {
                //Procede a colocarle como edad 0
                edadLista2 = 0;
                //Si no
            } else {
                //Procede a ir al metodo primerDatoCola de la lista Numero 2 y trae la edad de la personas
                edadLista2 = listaNumero2.primerDatoCola().getEdad();
            }

            // Si la edad de la persona de la lista 1 es mayor o igual a la edad de la persona de la lista 2
            if (edadLista1 >= edadLista2) {
                //Procede a insertar el dato de la persona de la lista 1 en la cola organizada
                listaOrdenada.insertar(listaNumero1.primerDatoCola());
                //Retira a la persona de la lista 1
                listaNumero1.extraerPersona();
                //Si no
            } else {
                //Procede a insertar el dato de la persona de la lista 2 en la cola organizada
                listaOrdenada.insertar(listaNumero2.primerDatoCola());
                //Retira a la persona de la lista 2
                listaNumero2.extraerPersona();
            }
        }

        System.out.println("Lista Organizada!!!");
        // Imprimimos la listaOrdenada con el metodo de imprimirCola
        listaOrdenada.imprimirCola();
        System.out.println("-----------------------------------");
    }
}