/*
 Dado una matriz de números enteros aleatorios, implemente un código Java que transforme el arreglo para
que cada elemento sea el siguiente múltiplo exacto de 5. (por ejemplo, 10 queda en 10, 14 pasa a ser 15, etc.)
public class CincuerizaMatriz {
// Crea una matriz N*N de números enteros con valores aleatorios entre 1 y X
// "Cincueriza" Transforma la matriz para que cada elemento sea el siguiente
múltiplo exacto de 5.
public static void main(String[] args) {
// Crea la matriz con valores aleatorios
// Muestra la matriz inicial en pantalla
// Cincueriza la matriz
// Muestra la matriz “cincuerizada” en pantalla
}
}
 */

package Punto2;

import java.util.Scanner;

public class CodigoPunto2 {

    public static void main(String[] args) {
        //Limpiar pantalla
        limpiarPantall();

        // Tamaño de la matriz N*N
        int N = 3;

        // Crear la matriz
        int matriz[][] = new int[N][N];

        //Crear escaner y valor final de X
        Scanner escaner = new Scanner(System.in);
        int valorFinal;
        System.out.print("Ingrese un valor aleatorio X para la matriz:");
        valorFinal = escaner.nextInt();

        //Llenar la matriz
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                matriz[i][j] = (int) (Math.random() * valorFinal);
            }
        }

        //Imprimir matriz 
        System.out.println("Matriz con numeros aleatorios: ");
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.print("["+ matriz[i][j]+"]\t");    
            }
            System.out.println();
        }

        //Cincuentariza la matriz
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                matriz[i][j] = Cincuentariza(matriz[i][j]);
            }
        }

        //Imprimir matriz 
        System.out.println("Matriz Cincuentariza: ");
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.print("["+ matriz[i][j]+"]\t");    
            }
            System.out.println();
        }

        escaner.close();
    }

    public static void limpiarPantall(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int Cincuentariza(int numero){
        int valorCincuentariza;
        while(numero%5!=0){
            numero++;
        }
        valorCincuentariza = numero;
        return valorCincuentariza;
    }
}
