/*
 Dado un vector, implemente un método que inserte un elemento en una posición dada del vector.
NOTA: Insertar un elemento en el vector desplaza una posición hacia la derecha a los elementos del vector que han
de quedar detrás del elemento insertado. Además, la inserción ocasiona la “desaparición” del último elemento del
vector. Complete el siguiente código de ejemplo:
public class InsertaArreglo {
public static void main(String[] args) {
// Crea e inicializa un arreglo de longitud N
// (pueden ser enteros, char, o cualquier tipo que desees)
// Inserta un nuevo elemento en la posición que diga el usuario.
// Si el usuario escribe la posición -1, finaliza el programa
// Muestra el arreglo en pantalla de forma comprensible
// Repite lo anterior.
}
}
 */

package Punto3;

import java.util.Scanner;

public class codigoPrincipal {

    // Inicialzar el tamaño de arreglo
    public static int N = 5;

    // Crear el arreglo
    public static int vector[] = new int[N];

    public static void main(String[] args) {

        // Crear un escaner
        Scanner escaner = new Scanner(System.in);

        // Llenar el vector con valores al azar
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        // Imprimir el vector
        imprimirVector();

        // Escoger que posicion editar
        int posicionEditar;
        do {
            System.out.print("Ingrese la posicion a editar entre 1 y " + (vector.length) + ": ");
            posicionEditar = escaner.nextInt();
            if (posicionEditar <= 0 || posicionEditar > vector.length) {
                System.out.println("Numero ingreso " + posicionEditar + " fuera de rango!!!.");
                System.out.println("Ingrese un numero valido!!!");
            }
        } while (posicionEditar <= 0 || posicionEditar > vector.length);

        int numeroNuevoIngresar;
        System.out.print("Ingrese el nuevo numero a agragar al vector: ");
        numeroNuevoIngresar = escaner.nextInt();

        int penultimo;
        penultimo = vector.length - 2;
                       
        for (int i = penultimo; i >= posicionEditar-1; i--) {
            vector[i + 1] = vector[i];
        }

        System.out.println();

        vector[posicionEditar - 1] = numeroNuevoIngresar;

        imprimirVector();

        escaner.close();
    }

    // Metodo para imprimir el vector
    public static void imprimirVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]\t");
        }
        System.out.println();
    }
}
