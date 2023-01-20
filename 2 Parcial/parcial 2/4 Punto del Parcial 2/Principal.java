import java.util.Scanner;

/*
Escribir un programa que cree una lista simplemente enlazada de N números enteros positivos al azar (entre
1 y 100), luego muestre la lista en pantalla, seguidamente genere un número X entero positivo aleatorio
(también entre 1 y 100) y luego elimine todos los elementos de la lista mayores que X, finalizando mostrando
nuevamente la lista en pantalla. N se pregunta por teclado al usuario al iniciar el programa. La forma de mostrar
una lista en pantalla es, por ejemplo: [ a b c d ]
*/

public class Principal{

    public static void main(String[] args) {
        int tamañoN, numeroAleatorio, numeroAleatorioEliminar;
        Scanner eScanner = new Scanner(System.in);

        Cola listaEnlazada = new Cola();
        Cola listaOrdenada = new Cola();

        System.out.println("Bienvenido!!!");
        System.out.print("Ingrese el numero del tamaño de la lista: ");
        tamañoN = eScanner.nextInt();

        //Generador numero aleatorio
        for (int i = 0; i < tamañoN; i++) {
            numeroAleatorio = (int) ((Math.random()) * 100) + 1;
            listaEnlazada.insertar(numeroAleatorio);
        }

        //Imprimir datos sin Modificacion Aleatorio
        System.out.println("");
        System.out.println("Lista Simplemente Enlazada Sin Modificacion");
        listaEnlazada.imprimirCola();
        
        //Generador de numero aleatorio dentro para eliminar datos
        numeroAleatorioEliminar = (int) ((Math.random()) * 100) + 1;
        System.out.println("");
        System.out.println("El numero generado aleatoriamente para eliminar los datos es: " + numeroAleatorioEliminar);

        //Borrado de datos
        while(listaEnlazada.tamañoCola() != 0){
            int numeroAleatorioDeLaLista;
            numeroAleatorioDeLaLista = listaEnlazada.primerDatoCola();

            if(numeroAleatorioEliminar < numeroAleatorioDeLaLista){
                listaEnlazada.extraerNumero();
            }else{
                listaOrdenada.insertar(listaEnlazada.primerDatoCola());
                listaEnlazada.extraerNumero();
            }                       
        }

        System.out.println("");
        //Imprimir datos sin Modificacion Aleatorio
        System.out.println("Lista Simplemente Enlazada Organizada");
        System.out.println("Borrando los elementos mayores que " + numeroAleatorioEliminar);
        listaOrdenada.imprimirCola();        
        eScanner.close();
    }
    
}