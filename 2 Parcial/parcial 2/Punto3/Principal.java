/*
 Realice una función en Java llamada listaInversa(x) que reciba una lista simplemente enlazada de elementos
(del tipo que usted desee) y devuelva otra lista simplemente enlazada con los elementos en orden inverso al de
la lista pasada como parámetro. Haga todas las definiciones necesarias.
 */

public class Principal {
    public static void main(String[] args) {

        Pila pilaInversa = new Pila();
        Lista nuevaLista = new Lista();

        int numeroAleatorio;
        //Numero aleatorio
        int tamañoN = 15;
        
        for (int i = 0; i < tamañoN; i++) {
            numeroAleatorio = (int) ((Math.random()) * 100) + 1;
            nuevaLista.insertarDato(numeroAleatorio);
            pilaInversa.push(numeroAleatorio);
        }
        System.out.println("Lista Normal");
        nuevaLista.imprimirDatos();

        System.out.println();
        System.out.println("Lista Inversa");
        System.out.print("[ ");
        while(pilaInversa.tamaño != 0){
            System.out.print(pilaInversa.pop()+" ");
        }
        System.out.print("]");
    }
}