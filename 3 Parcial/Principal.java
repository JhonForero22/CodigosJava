/*
 Jhon Arley Forero
 Luis David izquierdo
 Cesar Andres Hurtado 
 Duvan Rodriguez
 */

public class Principal {



    public static void main(String[] args) {
        limpiarPantall();
        int tamañoDatos = 10000;
        int numerosAleatorio = 10;
        Lista listaPrueba = new Lista();
        ArbolBinario aBinario = new ArbolBinario();

        long tiempoBuscaLista = 0;
        long tiempoBuscaArbol = 0;

        for (int i = 0; i <= tamañoDatos; i++) {
            int numeroAleatorio = (int) (Math.random() * 100000000);
            listaPrueba.insertarDato(numeroAleatorio);
            aBinario.agregarDato(numeroAleatorio);
            numeroAleatorio = 0;
        }
        int numeroAleatorio;

        for (int i = 0; i < numerosAleatorio; i++) {
            numeroAleatorio = (int) (Math.random() * 100000000);
            long t0 = System.nanoTime();
            listaPrueba.buscarPersona(numeroAleatorio);
            long t1 = System.nanoTime();
            tiempoBuscaLista = (t1 - t0);
            tiempoBuscaLista += tiempoBuscaLista;

            long t2 = System.nanoTime();
            aBinario.agregarDato(numeroAleatorio);
            long t3 = System.nanoTime();
            tiempoBuscaArbol = (t3 - t2);
            tiempoBuscaArbol += tiempoBuscaArbol;
        }

        System.out.println("La cantidad de tiempo que se demoro en buscar en la lista es de " + tiempoBuscaLista/numerosAleatorio);
        System.out.println("La cantidad de tiempo que se demoro en buscar en el arbol es de " + tiempoBuscaArbol/numerosAleatorio);
    }

    // Metodo para limpiar pantalla
    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

//conclusión: el árbol es más rapido y efectivo que la lista
